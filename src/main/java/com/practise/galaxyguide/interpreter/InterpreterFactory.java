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
import com.practise.galaxyguide.matcher.CreditsMatchingStrategy;
import com.practise.galaxyguide.matcher.ManyMatchingStrategy;
import com.practise.galaxyguide.matcher.MatchingStrategy;
import com.practise.galaxyguide.matcher.MuchQuestionMatchingStrategy;
import com.practise.galaxyguide.matcher.RomanAndForeignLiteralMatchingStrategy;
import com.practise.galaxyguide.validator.CommonValidator;
import com.practise.galaxyguide.validator.RomanForeignLiteralValidator;

// Should be Singleton

/**
 * A factory for creating Interpreter objects.
 */
public class InterpreterFactory {

    InterpreterContext context;

    public InterpreterFactory(InterpreterContext context) {
        super();
        this.context = context;
    }

    public BaseDomain interpret(String inputLine) {
        Expression expression = null;
        MatchingStrategy matchingStrategy = new RomanAndForeignLiteralMatchingStrategy();
        matchingStrategy.setInput(inputLine);

        if (matchingStrategy.match()) {
            expression = new RomanToForeignLiteralExpression(new RomanForeignLiteralValidator(), inputLine);
            return expression.interpret(this.context);
        }

        matchingStrategy = new CreditsMatchingStrategy();
        matchingStrategy.setInput(inputLine);
        if (matchingStrategy.match()) {
            expression = new ForiegnLiteralsToCreditExpression(new CommonValidator(), inputLine);
            return expression.interpret(this.context);
        }

        matchingStrategy = new MuchQuestionMatchingStrategy();
        matchingStrategy.setInput(inputLine);
        if (matchingStrategy.match()) {
            expression = new ForiegnLiteralsMuchQuestionExpression(new CommonValidator(), inputLine);
            return expression.interpret(this.context);
        }

        matchingStrategy = new ManyMatchingStrategy();
        matchingStrategy.setInput(inputLine);
        if (matchingStrategy.match()) {
            expression = new ForiegnLiteralsManyQuestionExpression(new CommonValidator(), inputLine);
            return expression.interpret(this.context);
        }

        return null;
    }

    public static void main(String[] args) {
        InterpreterFactory client = new InterpreterFactory(new InterpreterContext());
        System.out.println(client.interpret("glob is I"));

    }

}
