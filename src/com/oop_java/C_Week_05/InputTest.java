package com.oop_java.C_Week_05;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String name="";
        System.out.print("Enter your name:");

        //input.next();
        name=input.nextLine();

        System.out.print("enter a number:");
        int i=input.nextInt();

        System.out.println(name);
        char ch=' ';
        System.out.print("Press e to exit.");
        ch=input.next().charAt(0);



        if(ch=='e')
        {
            System.out.println("Exit");
        }

    }


}
