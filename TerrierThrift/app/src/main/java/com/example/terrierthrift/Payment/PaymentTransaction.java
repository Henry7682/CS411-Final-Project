package com.example.terrierthrift.Payment;

public class PaymentTransaction {
    private PaymentMethod paymentMethod;
    private double amount;
    private ItemListing itemListing;
    public PaymentTransaction(PaymentMethod paymentMethod, double amount, ItemListing itemListing){
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.itemListing = itemListing;
    }
    public Receipt generateReceipt(){
        // call on paymentMethod to process payment
        //if sucess generate a receipt
        // if unsuccess generate a NoReceipt or something
        boolean success = PaymentProcessor.completeTransaction(paymentMethod, amount);
        if(success){
            // itemListing creator's id, user's id, amount
            return new Receipt();
        } else{
            return new Receipt();
        }
    }
}
