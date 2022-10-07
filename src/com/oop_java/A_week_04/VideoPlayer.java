package com.oop_java.A_week_04;

public class VideoPlayer extends MediaPalayer{
        //a type of reuseability
        //MediaPalayer obj;


    public VideoPlayer(){
        super(1);
        System.out.println("This is constructor of Video player");
    }
    @Override
    public void play(){
        System.out.println("Pay method of video palyer");
    }


    public void setBrightness(){

    }

    @Override
    public String toString(){

        return super.toString()+" "+this.getClass().getSimpleName();
    }

}
