package com.bank.persistence.entity;

public enum Citizenship {

    RUS("Российская Федерация"),
    UKR("Україна"),
    BEL("Республика Беларусь");

    private final String fullName;

    Citizenship(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
