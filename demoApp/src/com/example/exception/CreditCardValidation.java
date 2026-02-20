package com.example.exception;

import java.util.*;

public class CreditCardValidation {

    static void validateCard(String cardNumber) throws InvalidCreditCardException {

        if (cardNumber.length() != 16) {
            throw new InvalidCreditCardException("Invalid Credit Card: Must be 16 digits");
        }

        // Check all characters are digits
        for (char c : cardNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidCreditCardException("Invalid Credit Card: Only digits allowed");
            }
        }

        System.out.println("Valid Credit Card");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String cardNumber = sc.nextLine();

        try {
            validateCard(cardNumber);
        } catch (InvalidCreditCardException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
