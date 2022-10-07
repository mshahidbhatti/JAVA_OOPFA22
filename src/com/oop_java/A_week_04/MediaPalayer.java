package com.oop_java.A_week_04;

public class MediaPalayer extends Object{
    private String mediplayerName;

   // MediaPalayer(){}
    public MediaPalayer(int a){
        System.out.println("This is media player constructor");
    }

    public void play(){

        System.out.println("play method of media palyer");
    }

    @Override
    public boolean equals(Object o){
        return false;
    }

    @Override
    public String toString(){
        return this.getClass().getName();
    }

}
