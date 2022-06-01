package com.bank.persistence.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    private Balance balance;
    private static final BigDecimal TEST_BALANCE_AMOUNT = new BigDecimal(1000);
    private static final Currency TEST_CURRENCY = Currency.RUB;
    private static final String TEST_WALLET_ID = "5469-1234-5678-9876";

    @BeforeEach
    void initBalance() {
        balance = new Balance(TEST_BALANCE_AMOUNT,TEST_CURRENCY,TEST_WALLET_ID);
    }

    @Test
    void addMoney_shouldAddCorrect() {
        var balanceAmount = balance.getAmount().doubleValue();
        balance.addMoney(new BigDecimal(100));
        var expectedBalance = (balanceAmount + 100);
        var actualValue = balance.getAmount().doubleValue();
        assertEquals(expectedBalance,actualValue);
    }

    @Test
    void subtractMoney_shouldSubtractCorrect() {
        var balanceAmount = balance.getAmount().doubleValue();
        balance.subtractMoney(new BigDecimal(100));
        var expectedBalance = (balanceAmount - 100);
        var actualValue = balance.getAmount().doubleValue();
        assertEquals(expectedBalance,actualValue);
    }
}
