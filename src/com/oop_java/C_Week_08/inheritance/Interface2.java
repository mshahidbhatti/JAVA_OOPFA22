package com.oop_java.C_Week_08.inheritance;

public interface Interface2 {

    void a();

    default void display(){
        System.out.println("");
    }
    static void print(){
        System.out.println("");
    }
}
