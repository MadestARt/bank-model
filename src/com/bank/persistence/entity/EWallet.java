package com.bank.persistence.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EWallet {

    private String id;
    private BigDecimal fundBalance;
    private Currency currency;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private PaymentSystem paymentSystem;

}
