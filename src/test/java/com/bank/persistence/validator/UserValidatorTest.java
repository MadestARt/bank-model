package com.bank.persistence.validator;

import com.bank.persistence.entity.Citizenship;
import com.bank.persistence.entity.UserEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private final UserValidator userValidator = UserValidator.getInstance();

    @Test
    void validResultIfUserValid() {
        UserEntity user = UserEntity.builder()
                .address("Чеченская Республика, г.Грозный, ул.Гаражная д.№10")
                .citizenship(Citizenship.RUS)
                .email("test@gmail.com")
                .fullName("Магомедов Хасбулла Магомедович")
                .phoneNumber("+7 996 027 28 48")
                .walletList(new ArrayList<>())
                .build();
        var validationResult = userValidator.validate(user);
        assertTrue(validationResult.isValid());
    }

    @Test
    void invalidResultIfUserInvalid() {
        UserEntity user = UserEntity.builder()
                .address("Чеченская Республика, г.Грозный, ул.Гаражная д.№10")
                .citizenship(Citizenship.RUS)
                .email("test@")
                .fullName("Магомедов Хасбулла Магомедович")
                .phoneNumber("+7 96 027 28 48")
                .walletList(new ArrayList<>())
                .build();
        var validationResult = userValidator.validate(user);
        assertFalse(validationResult.isValid());

    }


}
