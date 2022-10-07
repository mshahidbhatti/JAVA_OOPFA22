package com.oop_java.A_week_04;

public class CopyTest {
    public static void main(String[] args) {
        A obj3=new A();


        A temp=new A(obj3);

        System.out.println("=========================");

        System.out.println(obj3.b.x);
        System.out.println(temp.b.x);
        obj3.b.x=80;
        System.out.println("=========================");
        System.out.println(obj3.b.x);
        System.out.println(temp.b.x);

        A temp2=(A)obj3.clone();

    }
}
