package com.java.restcontroller;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<ValidAge, Integer> {

    @Override
    public void initialize(ValidAge validAge) {}

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {
        // Example: Check that age is between 18 and 120
        return age != null && age >= 18 && age <= 120;
    }
}

