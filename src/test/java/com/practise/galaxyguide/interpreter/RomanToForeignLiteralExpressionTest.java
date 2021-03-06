package com.practise.galaxyguide.interpreter;

import com.practise.galaxyguide.domains.ForeignLiteral;
import com.practise.galaxyguide.domains.RomanAndForeignLiteral;
import com.practise.galaxyguide.domains.RomanNumeralLiteral;
import com.practise.galaxyguide.interpreter.InterpreterContext;
import com.practise.galaxyguide.interpreter.RomanToForeignLiteralExpression;
import com.practise.galaxyguide.validator.RomanForeignLiteralValidator;
import com.practise.galaxyguide.validator.StringValidator;

import junit.framework.TestCase;

public class RomanToForeignLiteralExpressionTest extends TestCase {

    public void test_type() throws Exception {
        // TODO auto-generated by JUnit Helper.
        assertNotNull(RomanToForeignLiteralExpression.class);
    }

    public void test_instantiation() throws Exception {
        // TODO auto-generated by JUnit Helper.
        StringValidator stringValidator = null;
        String inputLine = null;
        RomanToForeignLiteralExpression target = new RomanToForeignLiteralExpression(stringValidator, inputLine);
        assertNotNull(target);
    }

    public void test_interpret_A$InterpreterContext() throws Exception {
        // TODO auto-generated by JUnit Helper.
        StringValidator stringValidator = new RomanForeignLiteralValidator();
        String inputLine = "glob is I";
        RomanToForeignLiteralExpression target = new RomanToForeignLiteralExpression(stringValidator, inputLine);
        InterpreterContext context_ = new InterpreterContext();
        RomanAndForeignLiteral actual = (RomanAndForeignLiteral) target.interpret(context_);
        RomanAndForeignLiteral expected = new RomanAndForeignLiteral(RomanNumeralLiteral.I, new ForeignLiteral("glob"));
        assertEquals(expected.toString(), actual.toString());
        assertEquals(expected.equals(actual), true);

    }

}
