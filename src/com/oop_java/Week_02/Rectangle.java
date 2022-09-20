package com.oop_java.Week_02;

public class Rectangle {
    private double length;
    private double width;
    private int x;
    private int y;

    public void setLength(double length){
        if(length>=0)
            this.length=length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calArea(){
        return  length*width;
    }

    public boolean isIntersect(Rectangle another){
        boolean overlap=false;
                        if(((int)this.getX()+this.getLength())<(another.getX())
                                ||(this.getY()+this.getWidth()<another.getY()))

                            overlap= false;
        else
                            overlap= true;
        return overlap;
    }


}
