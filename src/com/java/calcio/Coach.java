package com.java.calcio;

public class Coach extends Person {
    private final String strategy;


    public Coach(String homeCoach, String homeCoachBirthdate, String strategy) {
        super(homeCoach, homeCoachBirthdate);
        this.strategy = strategy;
    }

    public String getStrategy() {
        return strategy;
    }

}