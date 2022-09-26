package com.oop_java.A_Week02;

import java.security.SecureRandom;

public class Driver {
    public static void main(String[] args) {
        Deck deck=new Deck();
        //Card cards[]=deck.getDeck();

        for(int j=0;j<deck.getDeck().length;j++)
            System.out.println(deck.getDeck()[j].toString());


        deck.shuffle();
        System.out.println("===============================");
        for(int j=0;j<deck.getDeck().length;j++)
            System.out.println(deck.getDeck()[j].toString());


        Card player1[]=new Card[13];
        /*SecureRandom ran=new SecureRandom();
        System.out.println(ran.nextInt(52));*/
    }
}
