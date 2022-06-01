package com.bank.persistence.entity;

import com.bank.persistence.exception.InvalidUserDataException;
import com.bank.persistence.validator.UserValidator;
import com.bank.persistence.validator.ValidationResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    private List<UserEntity> users;
    private UserValidator userValidator;

    public void addUser(UserEntity user) {
        var validationResult = userValidator.validate(user);
        if (validationResult.isValid()) {
            users.add(user);
        } else {
            throw new InvalidUserDataException(validationResult);
        }


    }



}
