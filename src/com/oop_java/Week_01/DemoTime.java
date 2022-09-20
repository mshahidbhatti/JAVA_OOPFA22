package com.oop_java.Week_01;

//class variables/attributes/propertiese

//access modifiers public , private , default
// sestters getters
// passing object as argument to methods
// return objects from a method


public class DemoTime {

    public static void main(String[] args) {


        Time t1=new Time();
        t1.setSeconds(10);
        t1.setHours(10);
        t1.setMinutes(10);

        String time=t1.displayUniversalTimeFormat();
        System.out.println(time);

        Time t2=new Time();
        t2.setSeconds(11);
        t2.setHours(11);
        t2.setMinutes(11);

        //compareTimes(t2);

        t1.compareTimes(t2);


        Time t3=t1;
        t3=t1.getTime();


    }
}
