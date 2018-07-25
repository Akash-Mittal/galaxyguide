/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description - This is also an Abstract Class 
 * will run default string validations for corner cases and nulls
 * 
 * 
 */
package com.practise.galaxyguide.validator;

import java.util.Objects;

/**
 * The Class StringValidator.
 */
public abstract class StringValidator extends ValidationStrategy {
    private String input;

    public String getInput() {
        return this.input;
    }

    public StringValidator() {
        // TODO Auto-generated constructor stub
    }

    StringValidator(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public boolean validate() {
        if (defaultStringValidation())
            return this.process();
        else
            return false;
    }

    public boolean defaultStringValidation() {

        if (Objects.isNull(this.input) || this.input.isEmpty() || this.input.length() > Integer.MAX_VALUE)
            return false;
        else
            return true;
    }

    public abstract boolean process();
}
