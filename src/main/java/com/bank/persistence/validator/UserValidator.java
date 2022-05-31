package com.bank.persistence.validator;

import com.bank.persistence.entity.UserEntity;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.*;

@NoArgsConstructor(access = PRIVATE)
public class UserValidator implements Validator<UserEntity>{

    private static final UserValidator INSTANCE = new UserValidator();
    private static final String PHONE_NUMBER_REGEX = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";


    @Override
    public ValidationResult validate(UserEntity object) {
        var validationResult = new ValidationResult();
        if (!object.getPhoneNumber().matches(PHONE_NUMBER_REGEX)) {
            validationResult.addError("Формат телефона неверный");
        }
        if (!object.getEmail().matches(EMAIL_REGEX)) {
            validationResult.addError("Формат почты неверный");
        }
        return validationResult;
    }

    public static UserValidator getInstance() {
        return INSTANCE;
    }
}
