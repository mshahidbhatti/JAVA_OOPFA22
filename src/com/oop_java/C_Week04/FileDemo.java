package com.oop_java.C_Week04;

import java.io.File;
import java.io.Serial;
import java.lang.reflect.Method;

public class FileDemo {

    private static final long serialVersionUID = -2338626292552177485L;
    public static File file=new File("FileDemo");

    public static void main(String[] args) throws NoSuchMethodException {

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.list());
        System.out.println(file.exists());
        System.out.println(file.canExecute());

        System.out.println(file.hashCode());


        //////////////

        File f=new File("abc.txt");

        Class cls=f.getClass();


        Method methods[]=cls.getDeclaredMethods();




    }

}
