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
import com.practise.galaxyguide.validator.StringValidator;

/**
 * The Class ForiegnLiteralsMuchQuestionExpression.
 */
public class ForiegnLiteralsMuchQuestionExpression implements Expression {

    StringValidator stringValidator;
    String inputLine;

    public ForiegnLiteralsMuchQuestionExpression(StringValidator stringValidator, String inputLine) {
        super();
        this.stringValidator = stringValidator;
        this.inputLine = inputLine;
    }

    @Override
    public BaseDomain interpret(InterpreterContext context) {
        this.stringValidator.setInput(this.inputLine);
        if (this.stringValidator.validate())
            return context.getMuchQuestion(this.inputLine);
        return null;
    }
}
