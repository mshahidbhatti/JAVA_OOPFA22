package com.oop_java.temp;

public class Person {
    String name;
    Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob=dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
