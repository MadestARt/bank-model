package com.bank.persistence.validator;

public interface Validator<T> {

    ValidationResult validate(T object);
}
