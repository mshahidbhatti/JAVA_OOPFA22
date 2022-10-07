package com.oop_java.C_Week04;

public class Rectangle extends Shape{



    double length;
    double width;

    Rectangle(){
        super("Shape name");
        //this();
        System.out.println("Constrcutor of rectangle class");
    }


    public double calArea(){
        return  length*width;
    }

    //annotations
    //@SuppressWarnings()
    @Override
    public String toString(){

        String temp=String.format("%s ,  Length: %f, Width:%f",
                super.toString(),length,width);
        return temp;
    }

}
