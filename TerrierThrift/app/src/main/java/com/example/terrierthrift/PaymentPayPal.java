package com.example.terrierthrift;

public class PaymentPayPal extends PaymentMethod {
    private String authVenmo;

    public PaymentPayPal(String authVenmo) {
        this.authVenmo = authVenmo;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Venmo payment of $" + amount);
        // Venmo API logic here
    }
}
