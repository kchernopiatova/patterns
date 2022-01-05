package com.solvd.patterns.decorator;

public class SMS implements Chat{

    @Override
    public void sendMessage() {
        System.out.println("Send messages from your phone");
    }

    @Override
    public void readMessage() {
        System.out.println("Read messages from your phone");
    }
}
