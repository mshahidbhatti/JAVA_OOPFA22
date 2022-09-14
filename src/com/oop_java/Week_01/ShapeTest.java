package com.oop_java.Week_01;

public class ShapeTest {
    public static void main(String[] args) {
        int x;
        Circle c1=new Circle();
        Circle c2=new Circle();


        c1.setRadius(-1000);
        System.out.println(c1);
        System.out.println(c2);
        //default value of double is 0.0

        System.out.println(c1.radius);
        System.out.println(c2.radius);
        double r1=c1.getRadius();
        if(c1.getRadius()>c2.getRadius())
            System.out.println("Circle 1 is larger than 2");
    }
}
