package com.oop_java.A_Week_05;

import java.io.*;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file=new File("labdata.dat");
        writeToFile(file,"C-14_HOD_Lab Incharge_labname$lab incharge");
        String data[]=readFromFile(file);

        /*System.out.println(data[0].split("^")[0]);
        System.out.println(data[0].split("^")[1]);
    */ //   Lab lab1=new Lab(data[0].split("_")[0],data[0].split("_")[1]);

       // System.out.println(lab1);

        readDataUsingScanner(file);

    }

    private static String[] readFromFile(File file) throws IOException {
        String data[]=new String[1000];
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String text="";
        int counter=0;
        while((text=br.readLine())!=null) {
            data[counter++]=text;

        }
        return data;
    }

    private static void writeToFile(File file, String text) throws IOException {

        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(text);
        bw.newLine();
        bw.newLine();
        bw.close();
    }

    public static String[] readDataUsingScanner(File f) throws FileNotFoundException {

        Scanner sc=new Scanner(f);
        //System.out.println(sc.nextLine());
        String text="";


        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
        return null;
    }
}
