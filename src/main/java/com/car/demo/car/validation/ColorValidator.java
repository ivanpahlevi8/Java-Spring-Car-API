package com.car.demo.car.validation;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ColorValidator implements ConstraintValidator<Color, String> {

    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
        // TODO Auto-generated method stub
        List<String> colorList = Arrays.asList(
            "Red", "red",
            "Green", "green",
            "Blue", "blue",
            "Black", "black",
            "White", "white"
        );

        for (String color : colorList){
            if(color.equals(arg0)){
                return true;
            }
        }

        return false;
    }
    
}
