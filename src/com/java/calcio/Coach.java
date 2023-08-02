package com.java.calcio;

public class Coach extends Person {
    private String strategy;

    public Coach(String name, String birthdate, String strategy) {
        super(name, birthdate);
        this.strategy = strategy;
    }

    public String getStrategy() {
        return strategy;
    }

    public String getName() {
    return name;
    }
}