package com.oop_java.A_Week_03;

public class Driver {

    public static void main(String args[]){
        //public Book(String title, String author)
        //Book book1=new Book("Java Programing","Deitel");
        //Book book2=new Book("C++ Programing","Deitel");
        //Book book3=new Book("java Programing","Deitel");

        Book book4=new Book("Python programing");
        Book list[]=new Book[100];
        list[0]=new Book("Java Programing","Deitel");
        list[1]=new Book("C++ Programing","Deitel");
        list[2]=new Book("java Programing","Deitel",10);
        list[3]=new Book("Java Programing","Deitel");
        list[4]=new Book("C++ Programing","Deitel",5);
        list[5]=new Book("java Programing","Deitel");



        printList(list);

        System.out.println();


        //print total quantity
        System.out.println("Total Books in stock:" +countBooks(list));

        //Object o=new Object();
        //if(book1==book3)
          if(list[0].equals(list[1]))
            System.out.println("Books are equal");
        else
            System.out.println("Objects are not equal");

    }

    public static void printList(Book list[]){
        for(int i=0;i<list.length;i++)
            if(list[i]!=null)
                System.out.println(list[i]);
    }

    public static int countBooks(Book list[]){
        int totalCount=0;
        for(int i=0;i<list.length;i++)
            if(list[i]!=null) {
                System.out.println(list[i]);
                totalCount+=list[i].getQuantity();
            }
        return totalCount;
    }
}
