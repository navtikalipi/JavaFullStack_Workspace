package com.example.exception;

public class InvalidCreditCardException extends Exception {

    public InvalidCreditCardException(String message) {
        super(message);
    }
}
