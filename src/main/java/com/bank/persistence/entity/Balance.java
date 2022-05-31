package com.bank.persistence.entity;

import com.bank.persistence.exception.NotEnoughMoneyException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Balance {

    private BigDecimal amount;
    private Currency currency;

    public void addMoney(BigDecimal moneyAmount) {
        amount = amount.add(moneyAmount);
    }

    public void subtractMoney(BigDecimal moneyAmount) {
        if (amount.compareTo(moneyAmount) < 0) {
            throw new NotEnoughMoneyException();
        }
        amount = amount.subtract(moneyAmount);

    }
}
