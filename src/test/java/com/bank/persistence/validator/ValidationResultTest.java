package com.bank.persistence.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationResultTest {

    private ValidationResult validationResult;

    @BeforeEach
    void initValidationResult() {
        validationResult = new ValidationResult();
    }

    @Test
    void resultValidIfNoErrors() {
        assertTrue(validationResult.isValid());
    }

    @Test
    void resultInvalidIfSomeErrors() {
        validationResult.addError("test error");
        assertFalse(validationResult.isValid());
    }
}
