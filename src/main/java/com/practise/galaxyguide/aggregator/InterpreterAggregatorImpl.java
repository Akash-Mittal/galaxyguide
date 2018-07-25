/*

 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description - Description - It just Wrapper on Interpreter - this is another layer
 * 
 * 
 */
package com.practise.galaxyguide.aggregator;

import java.util.ArrayList;
import java.util.List;

import com.practise.galaxyguide.domains.BaseDomain;
import com.practise.galaxyguide.interpreter.InterpreterFactory;
import com.practise.galaxyguide.validator.ListValidator;
import com.practise.galaxyguide.validator.ObjectValidator;

/**
 * The Class InterpreterAggregatorImpl.
 */
public class InterpreterAggregatorImpl implements InterpreterAggregator {

    InterpreterFactory interpreterFactory;
    ObjectValidator objectValidator;

    public InterpreterAggregatorImpl(InterpreterFactory interpreterFactory) {
        super();
        this.interpreterFactory = interpreterFactory;
        objectValidator = new ListValidator();
    }

    private boolean validate(List<String> inputList) {
        this.objectValidator.setInput(inputList);
        return this.objectValidator.validate();
    }

    @Override
    public List<BaseDomain> getAllRomanandForiegnLiterl(List<String> inputList) {
        if (!this.validate(inputList))
            return null;
        List<BaseDomain> baseDomainList = new ArrayList<BaseDomain>();
        for (String string : inputList) {
            baseDomainList.add(this.interpreterFactory.interpret(string));
        }
        return baseDomainList;
    }

    @Override
    public List<BaseDomain> getAllForeignLiteralCredits(List<String> inputList) {
        if (!this.validate(inputList))
            return null;

        List<BaseDomain> baseDomainList = new ArrayList<BaseDomain>();
        for (String string : inputList) {
            baseDomainList.add(this.interpreterFactory.interpret(string));
        }
        return baseDomainList;
    }

    @Override
    public List<BaseDomain> getAllMuchQuestions(List<String> inputList) {
        if (!this.validate(inputList))
            return null;

        List<BaseDomain> baseDomainList = new ArrayList<BaseDomain>();
        for (String string : inputList) {
            baseDomainList.add(this.interpreterFactory.interpret(string));
        }
        return baseDomainList;
    }

    @Override
    public List<BaseDomain> getAllManyQuestions(List<String> inputList) {
        if (!this.validate(inputList))
            return null;

        List<BaseDomain> baseDomainList = new ArrayList<BaseDomain>();
        for (String string : inputList) {
            baseDomainList.add(this.interpreterFactory.interpret(string));
        }
        return baseDomainList;
    }

}
