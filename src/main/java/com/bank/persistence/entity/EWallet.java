package com.bank.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EWallet implements Wallet {

    private String id;
    private Balance fundBalance;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private PaymentSystem paymentSystem;

    @Override
    public Balance getBalance() {
        return fundBalance;
    }

    @Override
    public void withdrawMoney(BigDecimal amount) {
        fundBalance.subtractMoney(amount);
    }

    @Override
    public void depositMoney(BigDecimal amount) {
        fundBalance.addMoney(amount);
    }
}
