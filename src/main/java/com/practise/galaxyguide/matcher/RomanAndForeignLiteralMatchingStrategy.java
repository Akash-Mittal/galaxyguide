/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.matcher;

/**
 * The Class RomanAndForeignLiteralMatchingStrategy.
 */
public class RomanAndForeignLiteralMatchingStrategy extends MatchingStrategy {

    public RomanAndForeignLiteralMatchingStrategy() {
        // TODO Auto-generated constructor stub
    }

    public RomanAndForeignLiteralMatchingStrategy(String input) {
        super(input);
    }

    @Override
    protected boolean process() {
        if (this.getInput().split(" is ")[0].length() == 4) {
            return true;
        }
        return false;
    }

}
