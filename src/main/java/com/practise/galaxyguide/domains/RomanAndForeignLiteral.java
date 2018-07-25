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

import java.util.Objects;

/**
 * The Class RomanAndForeignLiteral.
 */
public class RomanAndForeignLiteral implements BaseDomain {
    private RomanNumeralLiteral romanNumeralLiteral;
    private ForeignLiteral foreignLiteral;

    public RomanAndForeignLiteral(RomanNumeralLiteral romanNumeralLiteral, ForeignLiteral foreignLiteral) {
        super();
        this.romanNumeralLiteral = romanNumeralLiteral;
        this.foreignLiteral = foreignLiteral;
    }

    public RomanAndForeignLiteral() {
        // TODO Auto-generated constructor stub
    }

    public RomanNumeralLiteral getRomanNumeralLiteral() {
        return romanNumeralLiteral;
    }

    public void setRomanNumeralLiteral(RomanNumeralLiteral romanNumeralLiteral) {
        this.romanNumeralLiteral = romanNumeralLiteral;
    }

    public ForeignLiteral getForeignLiteral() {
        return foreignLiteral;
    }

    public void setForeignLiteral(ForeignLiteral foreignLiteral) {
        this.foreignLiteral = foreignLiteral;
    }

    @Override
    public String toString() {
        return "RomanAndForeignLiteral [romanNumeralLiteral=" + romanNumeralLiteral + ", foreignLiteral="
                + foreignLiteral + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (Objects.isNull(obj))
            return false;
        if (obj instanceof RomanAndForeignLiteral) {
            RomanAndForeignLiteral literal = (RomanAndForeignLiteral) obj;
            if (literal.getForeignLiteral().toString().equals(this.getForeignLiteral().toString())
                    && literal.getRomanNumeralLiteral().toString().equals(this.getRomanNumeralLiteral().toString()))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

}
