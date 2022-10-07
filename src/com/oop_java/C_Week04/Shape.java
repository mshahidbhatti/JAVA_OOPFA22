package com.oop_java.C_Week04;

public class Shape extends Object{
    Point centerPoint=new Point();
    String name;
    Shape(String name){
        System.out.println(" No parameter constructor of shape class");
    }



    public String toString(){

        return String.format("Name of Shape : %s, %s  %s",
                this.getClass().getSimpleName()
                ,"Center Point:"
                , centerPoint);
    }

    public double calArea(){
        return 0;
    }

}
