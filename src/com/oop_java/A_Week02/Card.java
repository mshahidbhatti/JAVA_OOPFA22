package com.oop_java.A_Week02;

public class Card {
    private final String rank;
    private final String suit;
    public Card(String rank, String suit){
        this.rank=rank;
        this.suit=suit;
    }

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public String toString(){


        return String.format("%s of %s",this.rank,this.suit);
    }

}
