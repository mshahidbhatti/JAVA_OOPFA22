package com.oop_java.C_Week04;

public class Triangle extends Shape{

    double  base;
    double height;

Triangle(){
    //this must be first statement in the body of the constructor
    super("name");


}


    public double calArea(){

        return (base*height)/2;
    }
}
