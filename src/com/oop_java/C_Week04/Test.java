package com.oop_java.C_Week04;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    static File file = new File("src/com/oop_java/C_Week04");
    static File file2 = new File("src/com/oop_java/C_Week09");

    public static void main(String[] args) throws IOException {

        System.out.println(file);
        String filesNames[]=file.list();

        for(int i=0;i<filesNames.length;i++)
            System.out.println(filesNames[i]);

        System.out.println(file.isDirectory());
        System.out.println(file2.exists());
        file2.createNewFile();
        file2.mkdir();

/*

        Test t = new Test();



        Class tClass = t.getClass();
        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("method: " + methods[i]);

            File f=new File("abc.txt");

            Class class1=f.getClass();

            Method[] methods1=class1.getDeclaredMethods();

            Constructor[] con=class1.getDeclaredConstructors();

            Field[] fe=class1.getDeclaredFields();

            for(int j=0;j<methods1.length;j++)
                System.out.println(methods1[j]);


        }
        */

    }
}
