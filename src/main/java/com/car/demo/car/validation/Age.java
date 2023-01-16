package com.car.demo.car.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.*;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CarYearValidator.class)
public @interface Age {
    String message() default "Invalid Data";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
