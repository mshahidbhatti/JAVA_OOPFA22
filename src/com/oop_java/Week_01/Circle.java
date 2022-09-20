package com.oop_java.Week_01;

class Circle {

    //access modifier that restricts the access of attrbiute
    private double radius;


    public void setRadius(double r) {
        if(r>0)
            radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double calArea(){
        return Math.PI*radius*radius;
    }

    public double calCircum(){
        return Math.PI*2*radius;
    }




}
