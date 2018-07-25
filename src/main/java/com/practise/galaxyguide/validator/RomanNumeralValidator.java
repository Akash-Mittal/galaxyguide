/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.validator;

// TODO: Auto-generated Javadoc
/**
 * The Class RomanNumeralValidator.
 */
public class RomanNumeralValidator extends StringValidator {

    /**
     * The Enum InvalidRomanNumerals.
     */
    private enum InvalidRomanNumerals {
        IIII, XXXX, CCCC, MMMM, DD, LL, VV;
    }

    public RomanNumeralValidator() {
        super();
    }

    public RomanNumeralValidator(String input) {
        super(input);
    }

    @Override
    public boolean process() {
        for (InvalidRomanNumerals numerals : InvalidRomanNumerals.values()) {
            if (this.getInput().contains(numerals.toString()))
                return false;
        }
        return true;
    }
}
