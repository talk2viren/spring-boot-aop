package com.example.todoservice.validation;

import com.example.todoservice.model.UserEntity;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class UserValidator implements ConstraintValidator<ValidateUserEntiry,String> {
    @Override
    public boolean isValid(String userTypes, ConstraintValidatorContext constraintValidatorContext) {
        List<String> listUserTypes = Arrays.asList("Permanent","vendor");
        return listUserTypes.contains(userTypes);
    }
}
