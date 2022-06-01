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
    void isValid_shouldBeValid_whenNoErrors() {
        assertTrue(validationResult.isValid());
    }

    @Test
    void isValid_shouldBeInvalid_whenSomeErrors() {
        validationResult.addError("test error");
        assertFalse(validationResult.isValid());
    }
}
