package com.bank.persistence.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {

    private final List<String> errors = new ArrayList<>();

    public void addError(String errorMessage) {
        errors.add(errorMessage);
    }

    public String getValidationErrors() {
        if (!isValid()) {
            return String.join(" ; ", this.errors);
        }
        return "";
    }

    public boolean isValid() {
        return errors.isEmpty();
    }

}
