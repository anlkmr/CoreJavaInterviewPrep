package com.java.restcontroller;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public void initialize(ValidName validName) {}

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        // Example: Check that name is not blank and has at least 2 characters
        return name != null && name.trim().length() > 1;
    }
}
