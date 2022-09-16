package com.oop_java.A_Lab01;

public class Rectangle {
    private double length;
    private double width;

    private int x1;
    private int y1;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0)
            this.length = length;
    }

    public double getWidth() {

            return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calArea(){
        return length*width;
    }

}
