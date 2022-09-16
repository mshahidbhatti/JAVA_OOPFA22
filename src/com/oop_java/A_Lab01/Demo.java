package com.oop_java.A_Lab01;

public class Demo {
    public static void main(String[] args) {
        /*//Circle is class/type
        //circle1 reference to object of Circle
        Circle circle1=new Circle();
        System.out.println(circle1);
        //radius is private and cannot be accesd
       // circle1.radius=10;
        //System.out.println(circle1.radius);
        circle1.setRadius(20);

        double radius=circle1.getRadius();

        Circle circle2 = new Circle();

        circle2.setRadius(-30);
        //circle2.radius=-10;

        if(circle1.getRadius()>circle2.getRadius())
            System.out.println("Circle one is larger");

*/
        ////////////////////////////////

        Rectangle rectangle1=new Rectangle();
        rectangle1.setLength(10);
        rectangle1.setWidth(5);

        Rectangle rectangle2=new Rectangle();
        rectangle2.setLength(12);
        rectangle2.setWidth(7);

        System.out.println("The area of Rectangle :"+rectangle1.calArea());






    }
}
