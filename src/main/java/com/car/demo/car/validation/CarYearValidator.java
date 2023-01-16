package com.car.demo.car.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CarYearValidator implements ConstraintValidator<Age, Integer> {

    @Override
    public boolean isValid(Integer arg0, ConstraintValidatorContext arg1) {
        // TODO Auto-generated method stub
        if(arg0 > 2010 && arg0 < 2023){
            return true;
        }else {
            return false;
        }
    }
    
}
