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
 * The Class FindMetalValuesCommand.
 */
public class FindMetalValuesCommand implements Command {

    private SolutionHelperReciever helperReciever;
    List<BaseDomain> credits;
    List<BaseDomain> mapping;

    public FindMetalValuesCommand(SolutionHelperReciever helperReciever, List<BaseDomain> credits,
            List<BaseDomain> mapping) {
        super();
        this.helperReciever = helperReciever;
        this.credits = credits;
        this.mapping = mapping;
    }

    @Override
    public BaseDomain execute() {
        return this.helperReciever.getAllMetalValues(this.credits, this.mapping);
    }

}
