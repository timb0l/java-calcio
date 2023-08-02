package com.java.calcio;

import java.util.Date;

public class Person {
    protected String name;
    protected Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
