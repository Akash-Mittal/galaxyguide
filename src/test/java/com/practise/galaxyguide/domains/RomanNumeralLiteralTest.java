package com.practise.galaxyguide.domains;

import com.practise.galaxyguide.domains.RomanNumeralLiteral;

import junit.framework.TestCase;

public class RomanNumeralLiteralTest extends TestCase {

    public void test_type() throws Exception {
        assertEquals(1, RomanNumeralLiteral.I.getLevelCode());
        assertEquals(5, RomanNumeralLiteral.V.getLevelCode());
        assertEquals(10, RomanNumeralLiteral.X.getLevelCode());
        assertEquals(50, RomanNumeralLiteral.L.getLevelCode());
        assertEquals(100, RomanNumeralLiteral.C.getLevelCode());
    }

}
