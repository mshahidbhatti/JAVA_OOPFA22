package com.oop_java.C_Week_08.inheritance;

public class C extends B implements Interface1,Interface2{
    @Override
    public void interfaceMethod1() {

    }

    @Override
    public void interfaceMethod2() {

    }

    @Override
    public void display() {
        Interface1.super.display();
    }


    @Override
    public void a() {

    }

    //final method cannot be overriden
/*    @Override
    public void add(){

    }*/
}
