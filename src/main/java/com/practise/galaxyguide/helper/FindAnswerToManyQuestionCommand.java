/*
 * ThoughtWorks Assignment - Confidential
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
 * The Class FindAnswerToManyQuestionCommand.
 */
public class FindAnswerToManyQuestionCommand implements Command {

    private SolutionHelperReciever helperReciever;
    List<BaseDomain> credits;
    List<BaseDomain> mapping;
    List<BaseDomain> manyQuestions;

    public FindAnswerToManyQuestionCommand(SolutionHelperReciever helperReciever, List<BaseDomain> credits,
            List<BaseDomain> mapping, List<BaseDomain> manyQuestions) {
        super();
        this.helperReciever = helperReciever;
        this.credits = credits;
        this.mapping = mapping;
        this.manyQuestions = manyQuestions;
    }

    @Override
    public BaseDomain execute() {
        return this.helperReciever.getAnswerToManyQuestion(credits, mapping, manyQuestions);
    }
}
