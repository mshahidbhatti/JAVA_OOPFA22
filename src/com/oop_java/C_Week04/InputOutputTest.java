package com.oop_java.C_Week04;

import java.util.Scanner;

public class InputOutputTest {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);

        //String s=input.next();
        char ch=input.next().charAt(0);

        Scanner input2=new Scanner(System.in);


        //System.out.println("Your input is:"+s);
        System.out.println();
        System.out.printf(" %n char %c",ch);
      //  int i=input2.nextInt();

        input.nextLine();

        while(true){
            System.out.println("Enter any key to continue");
            ch=input.next().charAt(0);
            if(ch=='e')
                break;
        }




    }
}
