package com.solvd.patterns.decorator;

public class Messenger implements Channel, Chat{

    @Override
    public void readNews() {
        System.out.println("Read news from channels");
    }

    @Override
    public void createChannel() {
        System.out.println("Create your own channel");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message to contacts");
    }

    @Override
    public void readMessage() {
        System.out.println("Receive messages");
    }
}
