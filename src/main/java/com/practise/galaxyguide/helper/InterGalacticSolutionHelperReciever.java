/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.helper;

import java.util.ArrayList;
import java.util.List;

import com.practise.galaxyguide.domains.BaseDomain;
import com.practise.galaxyguide.domains.Credits;
import com.practise.galaxyguide.domains.Creditss;
import com.practise.galaxyguide.domains.ForeignLiteral;
import com.practise.galaxyguide.domains.Metal;
import com.practise.galaxyguide.domains.Metals;
import com.practise.galaxyguide.domains.RomanAndForeignLiteral;
import com.practise.galaxyguide.domains.RomanNumerals;
import com.practise.galaxyguide.validator.ListValidator;
import com.practise.galaxyguide.validator.ObjectValidator;

/**
 * The Class InterGalacticSolutionHelperReciever.
 */
public class InterGalacticSolutionHelperReciever implements SolutionHelperReciever {

    Credits credits;
    ObjectValidator objectValidator;

    public InterGalacticSolutionHelperReciever() {
        this.credits = null;
        objectValidator = new ListValidator();
    }

    @Override
    public BaseDomain getAllMetalValues(List<BaseDomain> credits, List<BaseDomain> mapping) {
        this.objectValidator.setInput(credits);
        if (!(this.objectValidator.validate()))
            return null;

        this.objectValidator.setInput(mapping);
        if (!(this.objectValidator.validate()))
            return null;

        Metals metals = new Metals();
        List<Metal> metalsList = new ArrayList<Metal>();
        for (BaseDomain baseDomain : credits) {
            if (!(baseDomain instanceof Credits))
                return null;
            this.credits = (Credits) baseDomain;
            metalsList.add(new Metal(this.credits.getForeignLiterals().get(2).toString(),
                    this.calculate(this.credits, mapping, true)));
        }

        metals.setMetalsList(metalsList);
        return metals;
    }

    private float calculate(Credits credits, List<BaseDomain> mapping, boolean forMetal) {
        return credits.getCredits()
                / RomanNumerals.parseRomanNumeral(this.fnToRNMapper(credits.getForeignLiterals(), mapping, forMetal));
    }

    private String fnToRNMapper(List<ForeignLiteral> fl, List<BaseDomain> mapping, boolean forMetal) {
        String map = "";
        int size = fl.size();
        if (forMetal)
            size = fl.size() - 1;

        for (int i = 0; i < size; i++) {
            for (BaseDomain baseDomain : mapping) {
                RomanAndForeignLiteral romanAndForeignLiteral = (RomanAndForeignLiteral) baseDomain;
                if (fl.get(i).getForeignLiteral().equals(romanAndForeignLiteral.getForeignLiteral().toString())) {
                    map = map + romanAndForeignLiteral.getRomanNumeralLiteral().toString();
                    break;
                }
            }
        }
        return map;
    }

    @Override
    public BaseDomain getAnswerToMuchQuestion(List<BaseDomain> credits, List<BaseDomain> mapping) {

        this.objectValidator.setInput(credits);
        if (!(this.objectValidator.validate()))
            return null;

        this.objectValidator.setInput(mapping);
        if (!(this.objectValidator.validate()))
            return null;

        List<Credits> credits2 = new ArrayList<Credits>();
        for (BaseDomain baseDomain : credits) {
            if (!(baseDomain instanceof Credits))
                return null;
            this.credits = (Credits) baseDomain;
            this.credits.setCredits(RomanNumerals
                    .parseRomanNumeral(this.fnToRNMapper(this.credits.getForeignLiterals(), mapping, false)));
            credits2.add(this.credits);
        }

        return new Creditss(credits2);
    }

    private float metalValue(Metals metals, String metalName) {
        for (Metal metal : metals.getMetalsList()) {
            // Check to find the metal equal value
            if (metal.getMetal().equals(metalName))
                return metal.getValue();
        }
        return -1;

    }

    @Override
    public BaseDomain getAnswerToManyQuestion(List<BaseDomain> credits, List<BaseDomain> mapping,
            List<BaseDomain> manyQuestions) {
        this.objectValidator.setInput(credits);
        if (!(this.objectValidator.validate()))
            return null;

        this.objectValidator.setInput(mapping);
        if (!(this.objectValidator.validate()))
            return null;

        this.objectValidator.setInput(manyQuestions);
        if (!(this.objectValidator.validate()))
            return null;

        Metals metals = (Metals) this.getAllMetalValues(credits, mapping);
        List<Credits> credits2 = new ArrayList<Credits>();
        for (BaseDomain baseDomain : manyQuestions) {
            if (!(baseDomain instanceof Credits))
                return null;
            this.credits = (Credits) baseDomain;
            int romanNumeralEquivalent = RomanNumerals
                    .parseRomanNumeral(this.fnToRNMapper(this.credits.getForeignLiterals(), mapping, true));
            float metalEquivalent = this.metalValue(metals, this.credits.getForeignLiterals().get(2).toString());
            this.credits.setCredits(metalEquivalent * romanNumeralEquivalent);
            credits2.add(this.credits);
        }

        return new Creditss(credits2);
    }

}
