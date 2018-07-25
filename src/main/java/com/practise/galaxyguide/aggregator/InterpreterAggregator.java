/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description - It just Wrapper on Interpreter - this is another layer
 * 
 * 
 */
package com.practise.galaxyguide.aggregator;

import java.util.List;

import com.practise.galaxyguide.domains.BaseDomain;

/**
 * The Interface InterpreterAggregator.
 */
public interface InterpreterAggregator {

    List<BaseDomain> getAllRomanandForiegnLiterl(List<String> inputList);

    List<BaseDomain> getAllForeignLiteralCredits(List<String> inputList);

    List<BaseDomain> getAllMuchQuestions(List<String> inputList);

    List<BaseDomain> getAllManyQuestions(List<String> inputList);

}
