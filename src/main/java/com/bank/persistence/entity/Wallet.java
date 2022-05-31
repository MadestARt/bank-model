package com.bank.persistence.entity;

import java.math.BigDecimal;

public interface Wallet {

    Balance getBalance();

    void withdrawMoney(BigDecimal amount);

    void depositMoney(BigDecimal amount);
}
