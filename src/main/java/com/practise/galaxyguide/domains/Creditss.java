/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description - Credits Aggregator
 * 
 * 
 */
package com.practise.galaxyguide.domains;

import java.util.List;

/**
 * The Class Creditss.
 */
public class Creditss implements BaseDomain {

    private List<Credits> credtiss;

    public List<Credits> getCredtiss() {
        return credtiss;
    }

    public void setCredtiss(List<Credits> credtiss) {
        this.credtiss = credtiss;
    }

    @Override
    public String toString() {
        return "Creditss [credtiss=" + credtiss + "]";
    }

    public Creditss(List<Credits> credtiss) {
        super();
        this.credtiss = credtiss;
    }

}
