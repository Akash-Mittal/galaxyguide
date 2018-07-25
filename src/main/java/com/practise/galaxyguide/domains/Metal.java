/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.domains;

/**
 * The Class Metal.
 */
public class Metal implements BaseDomain {

    String metal;
    float value;

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public float getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Metal(String metal, float value) {
        super();
        this.metal = metal;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Metal [metal=" + metal + ", value=" + value + "]";
    }

    public Metal() {
        // TODO Auto-generated constructor stub
    }
}
