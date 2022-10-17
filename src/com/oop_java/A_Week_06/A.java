package com.oop_java.A_Week_06;

public class A {
    int age; // age should be greater than 0

    public A(int age) {
        if(age<1)
            throw new IllegalArgumentException(" Parameter value is incorrect");
        this.age = age;
    }
}
