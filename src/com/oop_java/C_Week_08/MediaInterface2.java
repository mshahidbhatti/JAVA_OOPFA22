package com.oop_java.C_Week_08;

public interface MediaInterface2 {

    int maximum=1;
    void pause();
    void start();

    default void display(){
        System.out.println("Display of MediaPlayer2 interface");
    }
    static void print(){
        System.out.println("Print of mediaplayer2 interface");
    }
}
