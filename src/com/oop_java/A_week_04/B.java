package com.oop_java.A_week_04;

public class B {
    int x=77;
    int y;
    B(){

    }
    B(B obj){
        this.x=obj.x;
        this.y=obj.y;
    }

    public Object clone(){

        return new B(this);
    }
}
