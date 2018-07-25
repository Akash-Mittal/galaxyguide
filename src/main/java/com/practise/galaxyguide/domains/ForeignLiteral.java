/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.domains;

/**
 * The Class ForeignLiteral.
 */
public class ForeignLiteral implements BaseDomain {
    String foreignLiteral;

    public String getForeignLiteral() {
        return foreignLiteral;
    }

    public void setForeignLiteral(String foreignLiteral) {
        this.foreignLiteral = foreignLiteral;
    }

    public ForeignLiteral(String foreignLiteral) {
        super();
        this.foreignLiteral = foreignLiteral;
    }

    @Override
    public String toString() {
        return this.foreignLiteral;
    }

}
