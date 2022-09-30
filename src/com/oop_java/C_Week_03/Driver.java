package com.oop_java.C_Week_03;

import com.oop_java.C_Week02.Date;

public class Driver {

    private static Person list[];

    public static void main(String args[]){
        list=new Person[10];
        list[0]=new Person("first Name","Last Name", new Date(1,1,1));
        list[1]=new Person("first Name","Last Name", new Date(1,1,1));
        list[2]=new Person("first Name","Last Name", new Date(1,1,1));
        list[3]=new Person("first Name","Last Name", new Date(1,1,1));

        printPersonList(list);

        System.out.println();

        System.out.println("Total persons:"+countPersons(list));



    }

    public static void printPersonList(Person list[]){
        for(int i=0;i<list.length;i++)
            if(list[i]!=null)
            System.out.println(list[i]);
    }

    public static int countPersons(Person list[]){
        int counter=0;
        for(int i=0;i<list.length;i++)
            if(list[i]!=null)
                counter++;

        return counter;
    }

}
