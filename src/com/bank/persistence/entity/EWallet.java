package com.bank.persistence.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EWallet {

    private String id;
    private Balance fundBalance;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private PaymentSystem paymentSystem;

}
