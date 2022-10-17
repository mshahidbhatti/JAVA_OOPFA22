package com.oop_java.C_Week_05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        PC list[]=new PC[4];
        list[0]=new PC("A",1);
        list[0]=new PC("B",2);
        list[0]=new PC("C",3);
        list[0]=new PC("D",4);

        writeObject(list[0]);
        writeObject(list[1]);

        Object pc[]=readObject();
        System.out.println(pc);


    }

    public static void writeObject(Object o){
        try {
            FileOutputStream file = new FileOutputStream("data.dat", true);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(o);
            out.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object[] readObject() {
        FileInputStream fis = null;
        ArrayList<Object> objectsList=new ArrayList<>();
        try {
            fis = new FileInputStream("data.dat");
            objectsList = new ArrayList<>();
            boolean cont = true;
            while (cont) {
                try (ObjectInputStream input = new ObjectInputStream(fis)) {
                    Object obj = input.readObject();
                    if (obj != null) {
                        objectsList.add(obj);

                    } else {
                        cont = false;
                    }
                } catch (Exception e) {
                     System.out.println("e.printStackTrace()");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return objectsList.toArray();
    }
}
