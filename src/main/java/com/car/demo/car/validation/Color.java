package com.car.demo.car.validation;

import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ColorValidator.class)
public @interface Color {
    String message() default "Invalid Data";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
