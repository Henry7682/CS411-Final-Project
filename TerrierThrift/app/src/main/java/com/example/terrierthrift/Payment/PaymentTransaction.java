package com.example.terrierthrift.Payment;

public class PaymentTransaction {
    private PaymentMethod paymentMethod;
    private double amount;
    private ItemListing itemListing;
    public Receipt generateReceipt(){
        // call on paymentMethod to process payment
        //if sucess generate a receipt
        // if unsuccess generate a NoReceipt or something

    }
}
