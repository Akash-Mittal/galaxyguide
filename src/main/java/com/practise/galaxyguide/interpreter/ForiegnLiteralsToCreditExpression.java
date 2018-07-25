/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.interpreter;

import com.practise.galaxyguide.domains.BaseDomain;
import com.practise.galaxyguide.validator.StringValidator;

/**
 * The Class ForiegnLiteralsToCreditExpression.
 */
public class ForiegnLiteralsToCreditExpression implements Expression {

    StringValidator stringValidator;
    String inputLine;

    public ForiegnLiteralsToCreditExpression(StringValidator stringValidator, String inputLine) {
        super();
        this.stringValidator = stringValidator;
        this.inputLine = inputLine;
    }

    @Override
    public BaseDomain interpret(InterpreterContext context) {
        this.stringValidator.setInput(this.inputLine);
        if (this.stringValidator.validate())
            return context.getCredits(this.inputLine);
        return null;
    }
}
