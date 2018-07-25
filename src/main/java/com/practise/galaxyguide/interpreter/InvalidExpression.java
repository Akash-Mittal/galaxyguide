/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.interpreter;

import com.practise.galaxyguide.domains.BaseDomain;

/**
 * The Class InvalidExpression.
 */
public class InvalidExpression implements Expression {
    @Override
    public BaseDomain interpret(InterpreterContext context) {
        return null;
    }

}
