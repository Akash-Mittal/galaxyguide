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
 * The Class ForiegnLiteralsManyQuestionExpression.
 */
public class ForiegnLiteralsManyQuestionExpression implements Expression {

    StringValidator stringValidator;
    String inputLine;

    public ForiegnLiteralsManyQuestionExpression(StringValidator stringValidator, String inputLine) {
        super();
        this.stringValidator = stringValidator;
        this.inputLine = inputLine;
    }

    @Override
    public BaseDomain interpret(InterpreterContext context) {
        this.stringValidator.setInput(this.inputLine);
        if (this.stringValidator.validate())
            return context.getManyQuestion(this.inputLine);
        return null;
    }
}
