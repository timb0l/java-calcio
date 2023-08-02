package com.java.calcio;

public class Person {
    protected String name;
    protected String birthdate;

    public Person(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }
}
