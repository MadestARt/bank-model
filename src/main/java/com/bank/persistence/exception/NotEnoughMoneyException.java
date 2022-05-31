package com.bank.persistence.exception;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException() {
        super("Недостаточно средств для выполнения операции");
    }
}
