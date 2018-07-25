/*
 * Practice Assignment - Confidential
 * 
 * Author - Akash  Mittal
 * Version - See Maven Pom 1.0.0 Snapshot
 * Description -This is also an Abstract Class 
 * will run default Object validations for nulls
 * 
 * 
 */
package com.practise.galaxyguide.validator;

import java.util.Objects;

/**
 * The Class ObjectValidator.
 */
public abstract class ObjectValidator extends ValidationStrategy {
    private Object input;

    public Object getInput() {
        return this.input;
    }

    public ObjectValidator() {
        // TODO Auto-generated constructor stub
    }

    ObjectValidator(Object input) {
        this.input = input;
    }

    public void setInput(Object input) {
        this.input = input;
    }

    @Override
    public boolean validate() {
        if (defaultObjectgValidation())
            return this.process();
        else
            return false;
    }

    public boolean defaultObjectgValidation() {

        if (Objects.isNull(this.input))
            return false;
        else
            return true;
    }

    protected abstract boolean process();
}
