package com.bank.persistence.exception;

import com.bank.persistence.validator.ValidationResult;

public class InvalidUserDataException extends RuntimeException{


    public InvalidUserDataException(ValidationResult validationResult) {
        super(validationResult.getValidationErrors());
    }

}
