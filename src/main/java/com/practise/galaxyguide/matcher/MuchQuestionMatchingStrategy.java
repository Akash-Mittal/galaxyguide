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
 * The Class MuchQuestionMatchingStrategy.
 */
public class MuchQuestionMatchingStrategy extends MatchingStrategy {

    public MuchQuestionMatchingStrategy() {
        // TODO Auto-generated constructor stub
    }

    public MuchQuestionMatchingStrategy(String input) {
        super(input);
    }

    @Override
    protected boolean process() {
        if (this.getInput().contains("how much is")) {
            return true;
        }
        return false;
    }

}
