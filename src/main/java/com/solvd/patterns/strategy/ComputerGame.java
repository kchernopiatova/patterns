package com.solvd.patterns.strategy;

public class ComputerGame implements Program{

    @Override
    public void activate() {
        System.out.println("Play computer game");
    }

    @Override
    public void close() {
        System.out.println("Computer game was closed");
    }
}
