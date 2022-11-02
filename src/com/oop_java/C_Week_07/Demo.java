package com.oop_java.C_Week_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //exceptions
        // try catch finally

        //RuntimeException
        try {
            File f = new File("data.abc");
            FileWriter fw = new FileWriter(f);
        }
        catch(IOException e){

        }
        try {
            Scanner input = new Scanner(System.in);

            //NullPointerException
            Demo obj = new Demo(-1);
            obj.toString();
            int x = 5;
            int y = 0;

            //InputMismatchException
            y = input.nextInt();
            obj.divide(2,0);
            //arithmeticException
            double results = x / y;
            System.out.println(results);
            //throw new MyException();
            throw new Throwable();
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e){

            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Input mismatch");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){

        }
        catch (MyException e){}
        catch (Exception e){

        }
        catch (Throwable e){}

        finally {
            System.out.println("finally block");
        }
        System.out.println("Good Bye!");

    }

    //throws clause declaration
    double divide(int a, int b)throws  ArithmeticException, IndexOutOfBoundsException{
        return a/b;
    }

    Demo(int a){
        if(a<0)
            throw new IllegalArgumentException("Invalid argument values");
    }
}
