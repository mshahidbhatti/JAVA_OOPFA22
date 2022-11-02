package com.oop_java.A_Week_07;

import java.util.ArrayList;
import java.util.Arrays;

//dynamic arrays
//collection framework
public class Demo {
    public static void main(String[] args) {
        Person list[]=new Person[100];

        ArrayList<Person> list2=new ArrayList<Person>();
        //list2.add(new Object());
        for(int i=0;i<100;i++)
            list2.add(new Person("name :"+i));
        //list2.add("name");
        //list2.add(1);

        System.out.println(list2.size());

        //list2.sort();
        list2.remove(0);
        System.out.println(list2.size());
        list2.remove(new Person("name :2"));
        System.out.println(list2.size());

        System.out.println(list2.get(0).name);

        System.out.println(list2.indexOf(new Person("name :5")));

        list2.contains(new Person("name :5"));

        list2.set(3,new Person("name :0"));
        list2.clear();
        list2.addAll(Arrays.stream(list).toList());




    }

}
