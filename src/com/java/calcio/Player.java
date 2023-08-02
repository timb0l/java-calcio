package com.java.calcio;

public class Player extends Person {
    private String role;

    public Player(String name, String birthdate, String role) {
        super(name, birthdate);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
