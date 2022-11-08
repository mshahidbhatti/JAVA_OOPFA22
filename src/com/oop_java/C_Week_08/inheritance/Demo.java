package com.oop_java.C_Week_08.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // cannot instantiate object of abstract class
        A obj; //new A();

        // object of child class is assigned to reference of parent type
        obj=new B();

        obj.method2();

        // methods that are not declared in A cannot called through child reference
        //obj.methodOfB();

        ((B)obj).methodOfB();

        Interface2 obj1=new C();



        List list=new ArrayList<>();
        list.add(null);


    }
}
