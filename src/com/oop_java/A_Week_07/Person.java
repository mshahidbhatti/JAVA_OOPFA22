package com.oop_java.A_Week_07;

import java.util.Objects;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

public boolean equals(Object o){
        Person p=(Person) o;

        return p.name.equals(this.name);

}

}
