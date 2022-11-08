package com.oop_java.C_Week_08.CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.*;
import java.util.List;


public class Demo {
    public static void main(String[] args) {

        Iterable iterable;
        Collection collection;
        List list;

        iterable=new ArrayList();
        collection=new ArrayList(10);
        list=new ArrayList();

        //raw type
        ArrayList studentList=new ArrayList();
        studentList.add(1);
        studentList.add("Name");
        studentList.add(new Student("",""));

        //? extends Student
        ArrayList<Student> studentArrayList2=new ArrayList<>();
        studentArrayList2.add(new Student("Huzaifa","117"));
        //System.out.println(studentArrayList2.size());
        studentArrayList2.add(new Student("Shehroz","036"));
        //System.out.println(studentArrayList2.size());
        studentArrayList2.add(new Student("Ammar","090"));
        //System.out.println(studentArrayList2.size());
        studentArrayList2.add(1, new Student("Abdullah","045"));

        for(Student t:studentArrayList2)
            System.out.println(t);

        studentArrayList2.set(0, new Student("Asad","057"));

        studentArrayList2.sort(new Student("",""));
       // studentArrayList2.so
        System.out.println("================");

        for(Student t:studentArrayList2)
            System.out.println(t);


        //studentArrayList2.remove(1);
        System.out.println("After removing an element");
        studentArrayList2.remove(new Student("Asad","057"));
        System.out.println("================");

        for(Student t:studentArrayList2)
            System.out.println(t);
        //079999999999

        //studentArrayList2.contains(new Student("Hunain",""))
        //studentArrayList2.indexOf()
        studentArrayList2.get(0).name="new name";



        /*ArrayList<Student> list3=new ArrayList<Student>(studentArrayList2);
        list3.add(new Student("Hunain","024"));

        //list3.addAll(studentArrayList2);
        list3.addAll(4,studentArrayList2);
       // list3.add(studentList);
        */





    }
}
