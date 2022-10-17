package com.oop_java.C_Week_05;

import java.io.*;
import java.util.ArrayList;

public class SerlizeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<PC> list =new ArrayList<>();
        list.add(new PC("a",1));
        list.add(new PC("a",1));
        list.add(new PC("a",1));
        FileOutputStream fout=new FileOutputStream("data.dat");
        ObjectOutputStream outputStream=new ObjectOutputStream(fout);
        outputStream.writeObject(list);


        FileInputStream fin=new FileInputStream("data.dat");
        ObjectInputStream oin=new ObjectInputStream(fin);
        ArrayList<PC>  list2=(ArrayList<PC>) oin.readObject();

        for(PC temp:list2)
            System.out.println(temp);


    }
}
