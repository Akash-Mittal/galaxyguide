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

import java.util.List;

/**
 * The Class Credits.
 */
public class Credits implements BaseDomain {
    private List<ForeignLiteral> foreignLiterals;
    private float credits;

    @Override
    public String toString() {
        String temp = "";
        for (ForeignLiteral foreignLiteral : this.foreignLiterals) {
            temp = temp + " " + foreignLiteral.toString();
        }
        return temp + " is " + Math.round(this.credits) + " Credits";
    }

    public String toString1() {
        return "Credits [foreignLiterals=" + foreignLiterals + ", credits=" + credits + "]";
    }

    public List<ForeignLiteral> getForeignLiterals() {
        return foreignLiterals;
    }

    public void setForeignLiterals(List<ForeignLiteral> foreignLiterals) {
        this.foreignLiterals = foreignLiterals;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public Credits(List<ForeignLiteral> foreignLiterals, int credits) {
        super();
        this.foreignLiterals = foreignLiterals;
        this.credits = credits;
    }

    public Credits() {
        // TODO Auto-generated constructor stub
    }

}
