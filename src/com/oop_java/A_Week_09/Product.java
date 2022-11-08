package com.oop_java.A_Week_09;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {
    public String name;
    public double price;
    public double rating;
    public Date date;

    public Product(String name, double price, double rating, Date date) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int compare(Product o1, Product o2) {
        int flag=-1;
        if(o1.price>o2.price)
            flag=1;
        if(o1.price<o2.price)
            flag=-1;
        if(o1.price==o2.price)
            flag=0;

        return flag;

    }

    public static void main(String[] args) {
        ArrayList<Product> list=new ArrayList<Product>();
        list.add(new Product("Product 1",100,5,new Date(1,2,2022)));
        list.add(new Product("Product 2",100,5,new Date(1,2,2022)));
        list.add(new Product("Product 3",100,5,new Date(1,2,2022)));
        list.add(new Product("Product 4",100,5,new Date(1,2,2022)));
        list.add(new Product("Product 5",100,5,new Date(1,2,2022)));


        //sorting using comparable
        list.sort(new Product("",0,0,new Date(1,2,3)));


        Collections.sort(list,new Product("",0,0,new Date(1,2,3)));





    }


}
class Date {
    private int day; // day values rang from 0-30
    private int month;
    private int year;

    public Date(int day, int month, int year) {

        setDay(day);
        setMonth(month);
        setYear(year);


    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>0&&day<=30)
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>0&& month<=12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>0)
            this.year = year;
    }

    public String toString(){
        return day+"-"+month+"-"+year;
    }
}

