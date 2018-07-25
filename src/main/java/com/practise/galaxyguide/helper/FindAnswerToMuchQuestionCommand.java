/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.helper;

import java.util.List;

import com.practise.galaxyguide.domains.BaseDomain;

/**
 * The Class FindAnswerToMuchQuestionCommand.
 */
public class FindAnswerToMuchQuestionCommand implements Command {

    private SolutionHelperReciever helperReciever;
    List<BaseDomain> credits;
    List<BaseDomain> mapping;

    public FindAnswerToMuchQuestionCommand(SolutionHelperReciever helperReciever, List<BaseDomain> credits,
            List<BaseDomain> mapping) {
        super();
        this.helperReciever = helperReciever;
        this.credits = credits;
        this.mapping = mapping;
    }

    @Override
    public BaseDomain execute() {
        // TODO Auto-generated method stub
        return this.helperReciever.getAnswerToMuchQuestion(credits, mapping);
    }
}
