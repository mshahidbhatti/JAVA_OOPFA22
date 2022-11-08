package com.oop_java.C_Week_08.inheritance;

public interface Interface1 {
    // any feild declared in interface is public static and final by default
    int a=10;

    // by default public abstract
    void interfaceMethod1();
    void interfaceMethod2();

    default void display(){
        System.out.println("");
    }

    static void print(){
        System.out.println("");
    }
}
