package com.example.todoservice.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;
import java.util.concurrent.Callable;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = UserValidator.class)
public @interface ValidateUserEntiry {

    public String message() default  "Invalid UserType: It should be either Permanent for Vendor";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
