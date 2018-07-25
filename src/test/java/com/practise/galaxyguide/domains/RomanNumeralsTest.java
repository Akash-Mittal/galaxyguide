package com.practise.galaxyguide.domains;

import java.util.LinkedList;
import java.util.List;

import com.practise.galaxyguide.domains.RomanNumeralLiteral;
import com.practise.galaxyguide.domains.RomanNumerals;

import junit.framework.TestCase;

public class RomanNumeralsTest extends TestCase {

    public void test_type() throws Exception {
        // TODO auto-generated by JUnit Helper.
        assertNotNull(RomanNumerals.class);
    }

    public void test_instantiation() throws Exception {
        // TODO auto-generated by JUnit Helper.
        List<RomanNumeralLiteral> literal = null;
        RomanNumerals target = new RomanNumerals(literal);
        assertNotNull(target);
    }

    public void test_toString_A$() throws Exception {
        // TODO auto-generated by JUnit Helper.
        List<RomanNumeralLiteral> literal = new LinkedList<>();
        literal.add(RomanNumeralLiteral.C);
        literal.add(RomanNumeralLiteral.D);
        literal.add(RomanNumeralLiteral.I);
        literal.add(RomanNumeralLiteral.X);
        literal.add(RomanNumeralLiteral.M);

        RomanNumerals target = new RomanNumerals(literal);
        String actual = target.toString();
        String expected = "CDIXM";
        assertEquals(expected, actual);

    }

    public void testParseRomanNumeralToInteger() throws Exception {
        int target = RomanNumerals.parseRomanNumeral("XCMM");
        assertEquals(1890, target);
        target = RomanNumerals.parseRomanNumeral("MMMMM");
        assertEquals(0, target);
        target = RomanNumerals.parseRomanNumeral("XX");
        assertEquals(20, target);

    }

}