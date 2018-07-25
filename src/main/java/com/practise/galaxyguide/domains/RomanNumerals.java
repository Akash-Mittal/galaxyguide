/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.domains;

import java.util.List;

import com.practise.galaxyguide.validator.RomanNumeralValidator;
import com.practise.galaxyguide.validator.StringValidator;

/**
 * The Class RomanNumerals.
 */
public class RomanNumerals implements BaseDomain {
    private List<RomanNumeralLiteral> literals;

    public List<RomanNumeralLiteral> getLiteral() {
        return literals;
    }

    public void setLiteral(List<RomanNumeralLiteral> literal) {
        this.literals = literal;
    }

    @Override
    public String toString() {
        String val = "";
        for (RomanNumeralLiteral literal : this.literals) {
            val = val + literal.toString();
        }
        return val;

    }

    public RomanNumerals(List<RomanNumeralLiteral> literal) {
        super();
        this.literals = literal;
    }

    public static int parseRomanNumeral(String romanNumerals) {
        // To do add Validator
        StringValidator v = new RomanNumeralValidator(romanNumerals);
        if (v.validate())
            return RomanNumerals.romanToDecimal(romanNumerals);
        else
            return 0;
    }

    private static int romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();

        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }

    private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    public static RomanNumeralLiteral stringToEnum(String input) {
        switch (input) {
            case "I":
                return RomanNumeralLiteral.I;
            case "V":
                return RomanNumeralLiteral.V;
            case "X":
                return RomanNumeralLiteral.X;
            case "L":
                return RomanNumeralLiteral.L;
            case "C":
                return RomanNumeralLiteral.C;
            case "M":
                return RomanNumeralLiteral.M;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(RomanNumerals.parseRomanNumeral("MMMMM"));
    }
}
