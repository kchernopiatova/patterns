package com.solvd.patterns.strategy;

public class HomeScreen implements Program {

    @Override
    public void activate() {
        System.out.println("Computer is activated");
    }

    @Override
    public void close() {
        System.out.println("Computer is closed");
    }
}
