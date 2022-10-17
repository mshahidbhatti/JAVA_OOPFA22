package com.oop_java.A_Week_05;

public class Lab {
    String name;
    String attendant;

    public Lab(String name, String attendant) {
        this.name = name;
        this.attendant = attendant;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "name='" + name + '\'' +
                ", attendant='" + attendant + '\'' +
                '}';
    }
}
