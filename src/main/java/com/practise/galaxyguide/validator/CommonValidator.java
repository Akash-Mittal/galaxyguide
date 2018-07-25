/*
 * ThoughtWorks Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -
 * 
 * 
 */
package com.practise.galaxyguide.validator;

/**
 * The Class CommonValidator.
 */
public class CommonValidator extends StringValidator {

    public CommonValidator() {
        // TODO Auto-generated constructor stub
    }

    public CommonValidator(String input) {
        super(input);
    }

    // For now will only check for null or empty -
    @Override
    public boolean process() {
        return super.defaultStringValidation();
    }
}
