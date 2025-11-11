package com.example.terrierthrift.Payment;

public class PaymentVenmo extends PaymentMethod {
    private String authVenmo;

    public PaymentVenmo(String authVenmo) {
        this.authVenmo = authVenmo;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Venmo payment of $" + amount);
        // Venmo API logic here
    }
}
