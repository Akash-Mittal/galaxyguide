/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.validator;

import java.util.Objects;

import com.practise.galaxyguide.domains.RomanNumerals;

/**
 * The Class RomanForeignLiteralValidator.
 */
public class RomanForeignLiteralValidator extends StringValidator {

    public RomanForeignLiteralValidator() {
        // TODO Auto-generated constructor stub
    }

    public RomanForeignLiteralValidator(String input) {
        super(input);
    }

    @Override
    public boolean process() {
        String input = this.getInput();
        String[] splitinput = input.split(" is ");
        if ((splitinput[1]).length() != 1)
            return false;
        if (Objects.isNull(RomanNumerals.stringToEnum(splitinput[1])))
            return false;
        return true;
    }
}
