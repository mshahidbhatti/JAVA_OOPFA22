package com.oop_java.Week_02;

public class Driver {
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        r1.setLength(10);
        r1.setWidth(7);
        r1.setX(2);
        r1.setY(2);
        Rectangle r2=new Rectangle();
        r2.setLength(10);
        r2.setWidth(7);
        r2.setX(10);
        r2.setY(10);

        boolean overlap=r1.isIntersect(r2);
        System.out.println("Two ractangle overlap:"+overlap);
    }
}
