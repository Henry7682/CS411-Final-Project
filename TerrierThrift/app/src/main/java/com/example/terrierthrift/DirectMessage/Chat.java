package com.example.terrierthrift.DirectMessage;

public class Chat {
    private int chatID;
    private int buyerID;
    private int sellerID;
    private int listingID;

    private int createdAt;
    private int lastUpdatedAt;

    public Chat(){

    }

    public Chat(int buyerID, int sellerID, int listingID){

    }

    public static boolean appendMessage(int senderID, Message message){
        //To do
        // return true;
    }
}