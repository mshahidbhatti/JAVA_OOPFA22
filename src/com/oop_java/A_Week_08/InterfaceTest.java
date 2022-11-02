package com.oop_java.A_Week_08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class InterfaceTest implements interface1, interface2{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void display(){

    }

    public static void main(String[] args) {

        Collection col=new Vector();

        List lis=new ArrayList<>();


        interface1 obj=new InterfaceTest();
        interface2 obj2=new interface2() {
            @Override
            public void method1() {

            }
        };
    }
}
