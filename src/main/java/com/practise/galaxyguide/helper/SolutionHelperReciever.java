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
 * The Interface SolutionHelperReciever.
 */
public interface SolutionHelperReciever {
    // This shoud be refactored to all same type of return type as baseDomain

    BaseDomain getAnswerToMuchQuestion(List<BaseDomain> credits, List<BaseDomain> mapping);

    BaseDomain getAnswerToManyQuestion(List<BaseDomain> credits, List<BaseDomain> mapping,
            List<BaseDomain> manyQuestions);

    // Not putting inside the domain object will couple the code.
    BaseDomain getAllMetalValues(List<BaseDomain> credits, List<BaseDomain> mapping);
}
