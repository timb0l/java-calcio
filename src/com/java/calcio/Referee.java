package com.java.calcio;

public class Referee extends Person {
    private final String role;

    public Referee(String name, String birthdate, String role){
        super(name, birthdate);
        this.role = role;
    }
    public String getRole(){
        return role;
    }
}
