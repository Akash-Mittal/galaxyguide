package com.practise.galaxyguide.domains;

import com.practise.galaxyguide.domains.ForeignLiteral;

import junit.framework.TestCase;

public class ForeignLiteralTest extends TestCase {

    public void test_type() throws Exception {
        assertNotNull(ForeignLiteral.class);
    }

    public void test_instantiation() throws Exception {
        String foreignLiteral = null;
        ForeignLiteral target = new ForeignLiteral(foreignLiteral);
        assertNotNull(target);
    }

    public void test_getForeignLiteral_A$() throws Exception {
        String foreignLiteral = null;
        ForeignLiteral target = new ForeignLiteral(foreignLiteral);
        String actual = target.getForeignLiteral();
        String expected = null;
        assertEquals(expected, actual);
    }

    public void test_setForeignLiteral_A$String() throws Exception {
        // TODO auto-generated by JUnit Helper.
        String foreignLiteral = null;
        ForeignLiteral target = new ForeignLiteral(foreignLiteral);
        String foreignLiteral_ = null;
        target.setForeignLiteral(foreignLiteral_);
    }

    public void test_toString_A$() throws Exception {
        // TODO auto-generated by JUnit Helper.
        ForeignLiteral target = new ForeignLiteral("glob");
        String actual = target.getForeignLiteral();
        String expected = "glob";
        assertEquals(expected, actual);
    }

}
