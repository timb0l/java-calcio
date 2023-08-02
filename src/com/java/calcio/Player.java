package com.java.calcio;

import java.util.Date;

public class Player extends Person {
    private String role;

    public Player(String name, Date birthdate, String role) {
        super(name, birthdate);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
