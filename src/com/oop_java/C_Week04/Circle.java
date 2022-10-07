package com.oop_java.C_Week04;


//Circle is a subtuype
//Shape super type
public class Circle extends Shape{



    double radius;

    Circle(){
        super("name");
    }

    public double calArea(){
        return Math.PI*radius*radius;
    }



}
