package com.oop_java.A_Week_06;

import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
/*
        int numer1=10;
        int number2=10;
        try {
            double answer = numer1 / number2;
            System.out.println(answer);
            int a[]={1,2,3};
            System.out.println(a[4]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic overflow "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index block "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception block "+e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
*/

        /*Scanner input=new Scanner(System.in);

        System.out.print("Enter first Number");
        numer1=input.nextInt();
        System.out.print("Enter Second Number");
        number2=input.nextInt();*/
        A obj=null;
        try {
            obj = new A(0);
        }
        catch (IllegalArgumentException e){

        }

     //   B b=(A)obj;
        try {
            fileReading();
        }
        catch (FileNotFoundException e){

        }

        System.out.println("Good bye!");

    }


    public static void fileWriting() {
        try{
            File f = new File("abc");
            FileWriter fw = new FileWriter(f);
        }
        catch (IOException e){

        }

    }

    public static void fileReading() throws FileNotFoundException {

        File f=new File("");
        FileReader fr=new FileReader(f);
    }
}
