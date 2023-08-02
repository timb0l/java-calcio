package com.java.calcio;

import java.util.Date;

public class Coach extends Person {
    private String strategy;

    public Coach(String name, Date birthdate, String strategy) {
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