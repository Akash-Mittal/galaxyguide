/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.practise.galaxyguide.domains.BaseDomain;

/**
 * The Class ListValidator.
 */
public class ListValidator extends ObjectValidator {

    @SuppressWarnings("unchecked")
    @Override
    protected boolean process() {
        List<BaseDomain> baseDomains = new ArrayList<BaseDomain>();
        // if(!(this.getInput().getClass().equals(baseDomains.getClass()))) return false;
        baseDomains = (List<BaseDomain>) this.getInput();
        if (baseDomains.isEmpty())
            return false;
        for (Object object : baseDomains) {
            if (Objects.isNull(object))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ObjectValidator objectValidator = new ListValidator();
        List<BaseDomain> baseDomains = new ArrayList<BaseDomain>();
        objectValidator.setInput(baseDomains);
        System.out.println(objectValidator.validate());
    }

}
