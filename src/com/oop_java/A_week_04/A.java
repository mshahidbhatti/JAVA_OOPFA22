package com.oop_java.A_week_04;

public class A {
    static int var1=100;
    int var2=1;

    B b=new B();



    {
        System.out.println("1- non static block called");

        System.out.println(var1);
    }


    static {
        System.out.println("1- static block clalled");
        var1++;
        System.out.println(var1);
    }

    {
        System.out.println("1- non static block called");

        System.out.println(var1);
    }

    static {
        System.out.println("1- static block clalled");
        var1++;
        System.out.println(var1);
    }

    A(){
        b=new B();
        System.out.println(this);
        System.out.println("Constrcutor called");
    }
    A(A obj){
        this.var2= obj.var2;
        //object ref of B class
        this.b=new B(b);
    }

    public Object clone(){
        return new A(this);
    }

}
