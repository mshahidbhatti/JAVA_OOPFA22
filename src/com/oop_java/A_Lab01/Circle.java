package com.oop_java.A_Lab01;

public class Circle {
    //the value of radius should be positive
    //public means accisible to everyone
    //private accesible only within class
    private double radius;


    public void setRadius(double r){
        if(r>0)
            radius=r;
    }

    public double getRadius(){
        return radius;
    }


}
