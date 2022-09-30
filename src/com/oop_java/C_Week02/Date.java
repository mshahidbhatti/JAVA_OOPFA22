package com.oop_java.C_Week02;

public class Date {
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
