package com.solvd.patterns.strategy;

public class Browser implements Program{

    @Override
    public void activate() {
        System.out.println("Visiting websites");
    }

    @Override
    public void close() {
        System.out.println("Close browser");
    }
}
