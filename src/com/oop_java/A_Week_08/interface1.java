package com.oop_java.A_Week_08;

public interface interface1 {

    void method1();
    public abstract void method2();

    default void display(){
        System.out.println("default method of interface1");
    }

    static void print(){
        System.out.println("static method in interface");
    }

}
