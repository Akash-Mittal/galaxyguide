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
 * The Class ManyMatchingStrategy.
 */
public class ManyMatchingStrategy extends MatchingStrategy {

    public ManyMatchingStrategy() {
        // TODO Auto-generated constructor stub
    }

    public ManyMatchingStrategy(String input) {
        super(input);
    }

    @Override
    protected boolean process() {
        if (this.getInput().contains("how many credit is")) {
            return true;
        }
        return false;
    }

}
