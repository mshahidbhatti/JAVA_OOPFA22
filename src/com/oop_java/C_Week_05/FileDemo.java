package com.oop_java.C_Week_05;

import java.io.*;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File file= new File("data.txt");
        //FileWriter fw=new FileWriter(file);
        Scanner input=new Scanner(System.in);
        System.out.print("Enter name");
        String name=input.nextLine();

        writeToFile(file,name);
        String[] data = readFromFile(file);

        Person list[]=new Person[1000];

        for(int i=0;i<data.length;i++) {
            if(data[i]!=null) {
  //              System.out.println(data[i]);
                String firstName="";
                String lastName="";
                firstName=data[i].split("$")[0];
                lastName=data[i].split("$")[1];
                list[i]=new Person(firstName,lastName);

            }
        }

        for(int j=0;j< list.length;j++){
            if(list[j]!=null)
            System.out.println(list[j]);
        }



    }

    private static String[] readFromFile(File f) throws IOException {
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String data[]=new String[1000];
        String temp="";
        int couter=0;
        while((temp=br.readLine())!=null) {
        //    System.out.println(data);
            data[couter++]=temp;
        }
        return data;
    }

    private static void writeToFile(File file, String text) throws IOException {
        FileWriter fw=new FileWriter(file, true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(text);
        bw.newLine();
        bw.close();
    }

}
