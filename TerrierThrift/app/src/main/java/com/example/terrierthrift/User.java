package com.example.terrierthrift;

import java.util.List;
import java.util.Map;

public class User {

    private int userID;
    private String userName;
    private String email;
    private String name;
    private boolean hasAccount;
    private boolean isVerifiedUser;
    private List<ItemListing> listings;
    //private PaymentMethod paymentType; // not sure if this is necessary, paymentType is specific to each transaction

    public User(int userID, String userName, String email, String name) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.name = name;
        this.hasAccount = true;
    }

    public int getID() {
        return userID;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String n) {
        this.userName = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String n) {
        this.email = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public List<ItemListing> getListings() {
        return listings;
    }

    public boolean getVerification() {
        return isVerifiedUser;
    }

    // User can create a listing with inputted item details and at least one photo. Details is a nested dictionary to organize filters and sub-filter criteria.
    public ItemListing createListing(List<Photo> photos, Map details) {
        return null;
    }

    //Initiate a search on the marketplace
    public SearchEvent startSearch(List<FilterCriteria> criteria) {
        // To Do
        return null;
    }

    public boolean ownsListing(ItemListing item) {
        return listings.contains(item);
    }

    // choosePaymentMethod

    //initiate Transaction
    public static void createTransaction(PaymentType method) {
        // To Do

    }

    public static void submitReport(String targetType, int targetID, String reason, String details) {
        // Target type should be either "User" or "listing"
        // To Do
    }

}
