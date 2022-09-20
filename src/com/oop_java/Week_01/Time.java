package com.oop_java.Week_01;

public class Time {
    //class attributes are encapusalted

    private int minutes;
    private int hours;
    private int seconds;

        public void setTime(int hours, int minutes, int seconds){
           setMinutes(minutes);
           setHours(hours);
           setSeconds(seconds);
        }
    public void setMinutes(int m){
        if(m>=0&&m<70)
            minutes=m;
    }

    public void setHours(int h){
        if(h>=0&&h<24)
            hours=h;
    }

    public void setSeconds(int seconds) {
        if(seconds>=0&&seconds<60)
        this.seconds = seconds;
    }

    public int getMinutes(){return  minutes;}

    public int getHours() {
        return hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public String displayUniversalTimeFormat(){
        String time=minutes+":"+hours+":"+seconds;
        return time;
    }

    public int compareTimes(Time anotherTime){
        int t=-3;
        if(this.hours> anotherTime.hours)
            t=-1;
        if(this.hours== anotherTime.hours)
            t=0;
        if(this.hours< anotherTime.hours)
            t=1;

        return t;
    }


    public Time getTime(){
        return this;
    }

}
