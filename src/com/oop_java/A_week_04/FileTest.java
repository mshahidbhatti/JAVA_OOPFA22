package com.oop_java.A_week_04;

import java.io.File;

public class FileTest {

    public static void main(String[] args) throws NoSuchMethodException {
        File file=new File("src/com/oop_java/A_week_04");

        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.list().length);





    }
}
