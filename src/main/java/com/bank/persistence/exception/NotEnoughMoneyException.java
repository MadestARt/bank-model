package com.bank.persistence.exception;

public class NotEnoughMoneyException extends RuntimeException{

    private static final String MESSAGE_FORMAT = "Недостаточно средств для выполнения операции кошельку : %s";
    private String fullMessage;
    private String walletId;


    public NotEnoughMoneyException(String walletId) {
        fullMessage = MESSAGE_FORMAT.formatted(walletId);

    }

    @Override
    public String getMessage() {
        return fullMessage;
    }
}
