package com.practise.galaxyguide.validator;

import com.practise.galaxyguide.validator.RomanForeignLiteralValidator;
import com.practise.galaxyguide.validator.StringValidator;

import junit.framework.TestCase;

public class StringValidatorTest extends TestCase {

    public void test_type() throws Exception {
        assertNotNull(StringValidator.class);
    }

    public void test_validate_A$() throws Exception {
        // Thats intresting to see
        StringValidator target = new RomanForeignLiteralValidator();
        boolean actual = target.validate();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    public void test_defaultStringValidation_empty() throws Exception {
        // TODO auto-generated by JUnit Helper.
        StringValidator target = new RomanForeignLiteralValidator();
        target.setInput("");
        boolean actual = target.defaultStringValidation();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    public void test_defaultStringValidation_null() throws Exception {
        // TODO auto-generated by JUnit Helper.
        StringValidator target = new RomanForeignLiteralValidator();
        target.setInput(null);
        boolean actual = target.defaultStringValidation();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    public void test_defaultStringValidation_happy() throws Exception {
        // TODO auto-generated by JUnit Helper.
        StringValidator target = new RomanForeignLiteralValidator();
        target.setInput("ThoughtWorks");
        boolean actual = target.defaultStringValidation();
        boolean expected = true;
        assertEquals(expected, actual);
    }

}