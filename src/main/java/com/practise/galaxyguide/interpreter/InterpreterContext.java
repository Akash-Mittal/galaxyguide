/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.interpreter;

import java.util.ArrayList;

import com.practise.galaxyguide.domains.BaseDomain;
import com.practise.galaxyguide.domains.Credits;
import com.practise.galaxyguide.domains.ForeignLiteral;
import com.practise.galaxyguide.domains.RomanAndForeignLiteral;
import com.practise.galaxyguide.domains.RomanNumerals;
import com.practise.galaxyguide.validator.CommonValidator;
import com.practise.galaxyguide.validator.StringValidator;

/**
 * The Class InterpreterContext.
 */
public class InterpreterContext {

    StringValidator stringValidator;

    public InterpreterContext() {
        stringValidator = new CommonValidator();
    }

    public BaseDomain getRomanLiteral(String lineInput) {
        stringValidator.setInput(lineInput);
        if (!stringValidator.validate() || lineInput.length() < 2)
            return null;
        String splitInput[] = lineInput.split(" is ");
        RomanAndForeignLiteral romanAndForeignLiteral = new RomanAndForeignLiteral();
        romanAndForeignLiteral.setForeignLiteral(new ForeignLiteral(splitInput[0].trim()));
        stringValidator.setInput(RomanNumerals.stringToEnum(splitInput[1].trim()).toString());
        if (!stringValidator.validate() || splitInput[1].trim().length() > 1)
            return null;
        romanAndForeignLiteral.setRomanNumeralLiteral(RomanNumerals.stringToEnum(splitInput[1].trim()));
        return romanAndForeignLiteral;
    }

    public BaseDomain getCredits(String lineInput) {
        stringValidator.setInput(lineInput);
        if (!stringValidator.validate())
            return null;
        String splitInput[] = lineInput.split(" is ");
        Credits credits = new Credits();
        String words[] = splitInput[0].split(" ");
        String splitCredits[] = splitInput[1].split(" ");
        if (words.length != 3 || splitCredits.length != 2)
            return null;
        ArrayList<ForeignLiteral> fwords = new ArrayList<ForeignLiteral>();
        fwords.add(new ForeignLiteral(words[0].trim()));
        fwords.add(new ForeignLiteral(words[1].trim()));
        fwords.add(new ForeignLiteral(words[2].trim()));
        Integer a;
        try {
            a = Integer.parseInt(splitCredits[0].trim());
        } catch (NumberFormatException numberFormatException) {
            // Log Exception with Error Level
            return null;
        }
        credits.setForeignLiterals(fwords);
        credits.setCredits(a);
        return credits;
    }

    public BaseDomain getMuchQuestion(String lineInput) {
        stringValidator.setInput(lineInput);
        if (!stringValidator.validate())
            return null;
        String splitInput[] = lineInput.split(" is ");
        Credits credits = new Credits();
        String words[] = splitInput[1].split(" ");
        if (words.length < 1)
            return null;
        ArrayList<ForeignLiteral> fwords = new ArrayList<ForeignLiteral>();
        for (int i = 0; i < words.length - 1; i++) {
            fwords.add(new ForeignLiteral(words[i].trim()));
        }
        credits.setForeignLiterals(fwords);
        credits.setCredits(-1);
        return credits;
    }

    // Need Refactoring
    public BaseDomain getManyQuestion(String lineInput) {
        stringValidator.setInput(lineInput);
        if (!stringValidator.validate())
            return null;
        String splitInput[] = lineInput.split(" is ");
        Credits credits = new Credits();
        String words[] = splitInput[1].split(" ");
        if (words.length < 1)
            return null;
        ArrayList<ForeignLiteral> fwords = new ArrayList<ForeignLiteral>();
        for (int i = 0; i < words.length - 1; i++) {
            fwords.add(new ForeignLiteral(words[i].trim()));
        }
        credits.setForeignLiterals(fwords);
        credits.setCredits(-1);
        return credits;
    }
    // An ideal Candiate for Refactoring

}
