package com.example.terrierthrift.DirectMessage;

public class Message {
    private int messageID;
    private int chatID;
    private int senderID;
    private int receiverID;
    private String body;
    private int sentAt;

    public Message(){

    }

    public Message(int senderID, int receiverID, String body){

    }
}