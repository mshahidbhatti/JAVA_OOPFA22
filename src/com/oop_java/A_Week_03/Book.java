package com.oop_java.A_Week_03;

public class Book {
    private String title;
    private String author;
    private int quantity;

    //constructor overloading
    public Book(String title, String author, int quantity){
        this.title=title;
        this.author=author;
        this.quantity=quantity;
    }
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    public Book(String title){
        this.title=title;
        this.author="unknown";
    }
    public Book(){

    }


    public String toString(){
        return "Title :"+title +" Author "+author;
    }

    //override equals
    public boolean equals(Object o){

        //type casting, down casting
        Book temp=(Book)o;

        return (title.equalsIgnoreCase(temp.title)&&this.author.equalsIgnoreCase(temp.author));
    }

    public int getQuantity(){
        return quantity;
    }





}
