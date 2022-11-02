package com.oop_java.A_Week_08;

public interface interface2 {
    void method1();

    default void display(){
        System.out.println("display of interface2");

    }

    static void print(){
        System.out.println("print of interface 2");
    }
}
