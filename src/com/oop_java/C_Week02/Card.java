package com.oop_java.C_Week02;

public class Card {
    private String suit;
    private String rank;

    Card(String rank, String suit){
        this.rank=rank;
        this.suit=suit;


    }

    public String getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }

    //override toString default definition
    public String toString(){
        return rank +" of "+suit;
    }

}
