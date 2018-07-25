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

/**
 * The Enum RomanNumeralLiteral.
 */
public enum RomanNumeralLiteral implements BaseDomain {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private final int levelCode;

    private RomanNumeralLiteral(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return this.levelCode;
    }

}
