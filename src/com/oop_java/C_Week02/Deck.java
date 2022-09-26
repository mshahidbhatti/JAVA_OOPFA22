package com.oop_java.C_Week02;

import java.security.SecureRandom;

public class Deck {
    //instance variables
    private final String SUITS[]={"clubs","diamonds","spades","hearts"};
    private final String RANKS[]={"Ace","2","3","4","5","6","7","8",
            "9","10","Jack","Queen","King"};
    private final int DECK_LENGTH=52;
    private Card deck[];

    //use defined constructor
    Deck(){
        deck=new Card[DECK_LENGTH];
        //local variable
        int counter=0;

        for(int i=0;i<deck.length;i++)
            deck[i]=new Card(RANKS[i%RANKS.length],SUITS[i% SUITS.length]);

    }

    public void displayDeck(){
        for(int i=0;i<deck.length;i++)
            System.out.println(deck[i].getRank()+" of "+ deck[i].getSuit());
    }


    public void shuffle(){
        SecureRandom random=new SecureRandom();
        int ran=random.nextInt(52);


    }




}
