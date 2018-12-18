/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description - This Package has been introduced as part of My Code Review 
 * 	and refactoring - Happy Just Made this piece reusable.
 * Alot of Refactoring is needed.
 * 
 * 
 */
package com.practise.galaxyguide.matcher;

import java.util.Objects;

/**
 * The Class MatchingStrategy.
 */
public abstract class MatchingStrategy {
    private String input;

    public String getInput() {
        return this.input;
    }

    public MatchingStrategy() {
        // 
    }

    MatchingStrategy(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public boolean defaultStringValidation() {
        if (Objects.isNull(this.input) || this.input.isEmpty() || this.input.length() > Integer.MAX_VALUE)
            return false;
        else
            return true;
    }

    public boolean match() {
        if (defaultStringValidation())
            return this.process();
        else
            return false;
    }

    protected abstract boolean process();

}
