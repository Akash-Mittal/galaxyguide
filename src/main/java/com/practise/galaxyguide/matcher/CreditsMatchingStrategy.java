/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.matcher;

/**
 * The Class CreditsMatchingStrategy.
 */
public class CreditsMatchingStrategy extends MatchingStrategy {

    public CreditsMatchingStrategy() {
        // 
    }

    public CreditsMatchingStrategy(String input) {
        super(input);
    }

    @Override
    protected boolean process() {
        if (this.getInput().split(" is ")[0].split(" ").length == 3
                && this.getInput().split(" is ")[1].split(" ")[1].matches("credit")) {
            return true;
        }
        return false;
    }

}
