package com.oop_java.C_Week_03;

public class A {
    //instance variable
    int x=5;

    //class variable
    static int y=7;



    A(){
        System.out.println("constructor is called");
        System.out.println(y);
        nonSense();

    }
    {
        System.out.println("Unnamed block 1");
        y--;
    }
    {
        System.out.println("Unnamed block 2");
    }
    static {
        System.out.println("Unnamed static block 1");
    }
    static {
        System.out.println("Unnamed static block 1");
    }


    public static void main(String[] args) {
        A obj=new A();

    }


    public static void nonSense(){
        System.out.println("Non sense ");
    }

//toString
    //equals
    //compare

    public Object clone(){
        A temp=new A();
        temp.x=this.x;
        return temp;
    }


}
