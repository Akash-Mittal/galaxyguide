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

import com.practise.galaxyguide.domains.BaseDomain;

/**
 * The Class SolutionInvoker.
 */
public class SolutionInvoker {

    public Command command;

    public SolutionInvoker(Command command) {
        super();
        this.command = command;
    }

    public BaseDomain execute() {
        return this.command.execute();
    }

}
