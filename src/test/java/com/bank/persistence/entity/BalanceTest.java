package com.bank.persistence.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    private Balance balance;


    @BeforeEach
    void initBalance() {
        balance = new Balance(new BigDecimal(1000),Currency.RUB);
    }

    @Test
    void balanceIfMoneyAdded() {
        var balanceAmount = balance.getAmount().doubleValue();
        balance.addMoney(new BigDecimal(100));
        assertEquals((balanceAmount + 100),balance.getAmount().doubleValue());
    }

    @Test
    void balanceIfMoneySubtracted() {
        var balanceAmount = balance.getAmount().doubleValue();
        balance.subtractMoney(new BigDecimal(100));
        assertEquals((balanceAmount - 100),balance.getAmount().doubleValue());
    }
}
