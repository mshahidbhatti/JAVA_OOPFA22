package com.oop_java.C_Week_05;

public class StringTest {


    public static void main(String[] args) {

        String s1=new String();

        String s2=" text ";
        String s3=" text ";
        String s4=" text ";


        // String objects are immutable

        s4=s4+" new text";

        StringBuilder s5=new StringBuilder();
        s5.append(s4);

        String s6=new String(s4);
        ImmutableClass ob=new ImmutableClass(13);
        String name1="Arham";
        String name2="Hamza";

        System.out.println(name1.compareTo(name2));
        System.out.println(name2.compareTo(name2));
        System.out.println(name2.compareTo(name1));

        System.out.println(name1.contains("ham"));
        System.out.println(name2.contains("ham"));


        System.out.println(name1.substring(1,4));
        System.out.println();
        System.out.println(name1.indexOf('h'));
        System.out.println(name1.indexOf("am"));

        System.out.println(name1.getBytes()[0]);




    }

}
