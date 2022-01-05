package com.solvd.patterns.listener;

public class User implements Message{

    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void newMessage(String message) {
        System.out.println(String.format("%s received new message: %s", username, message));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
