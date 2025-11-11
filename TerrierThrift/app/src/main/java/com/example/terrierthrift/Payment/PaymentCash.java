package com.example.terrierthrift.Payment;

public class PaymentCash extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Agreement to pay in cash $" + amount);
    }
}
