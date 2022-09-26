package com.oop_java.A_Week02;
import java.security.SecureRandom;

public class Deck {

    private String suits[]={"hearts","clubs","diamonds","spades"};
    //private String ranks[]=new String[50];
    private String ranks[]={"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};



    public static final int LENGTH=52;
    private Card deck[];


    Deck(){
        deck=new Card[LENGTH];

        int counter=0;
        for(int i=0;i<suits.length;i++)
            for(int j=0;j< ranks.length;j++) {
                deck[counter++] =
                        new Card(ranks[counter % ranks.length],
                                suits[counter % suits.length]);
               // deck[counter++]=new Card("Ace","Spades");
            }


    }

    public Card[] getDeck() {
        return deck;
    }


    public void shuffle(){

        SecureRandom random=new SecureRandom();
        Card temp=null;
        for(int i=0;i<10000;i++)
        {
            int index=random.nextInt(52);
            temp=deck[0];

            deck[0]=deck[index];
            deck[index]=temp;




        }


    }
}
