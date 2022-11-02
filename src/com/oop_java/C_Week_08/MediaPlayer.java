package com.oop_java.C_Week_08;

interface MediaPlayer {
    void start();
    void stop();

    default void display(){
        System.out.println("default method of interface");
    }

    static void print(){
        System.out.println("Static print method of interface");
    }
}
