/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description - Metal Aggregaor
 * 
 * 
 */
package com.practise.galaxyguide.domains;

import java.util.List;

/**
 * The Class Metals.
 */
public class Metals implements BaseDomain {

    List<Metal> metalsList;

    public Metals(List<Metal> metalsList) {
        super();
        this.metalsList = metalsList;
    }

    public Metals() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Metals [metalsList=" + metalsList + "]";
    }

    public List<Metal> getMetalsList() {
        return metalsList;
    }

    public void setMetalsList(List<Metal> metalsList) {
        this.metalsList = metalsList;
    }

}
