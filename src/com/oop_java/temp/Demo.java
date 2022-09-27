package com.oop_java.temp;

public class Demo {
    public static void main(String[] args) {

        Plot obj=new Plot(new Person("ABc", new Date(1,1,1)),new Address("Pak"));

        obj.owner.getName();


    }
}
