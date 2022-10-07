package com.oop_java.C_Week_03;

public class B {
    int var1;
    int var2;
    A a;


    public Object clone(){

        B obj=new B();
        obj.var1=this.var1;
        obj.var2=this.var2;
        obj.a=(A)this.clone();
        return obj;
    }

    B(){
        var1=10;
        var2=20;
        a=new A();
    }


    public static void main(String[] args) {

        B b1=new B();

        B b2=new B();

        B b3=(B)b2.clone();


        System.out.println(b3.a.x);


        b1.a=b2.a;
        b1.a.x=1000;

        System.out.println(b2.a.x);
    }


}
