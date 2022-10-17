package com.oop_java.C_Week_05;

import java.io.Serializable;

public class PC implements Serializable {

    String name;
    double speed;

    public PC(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
