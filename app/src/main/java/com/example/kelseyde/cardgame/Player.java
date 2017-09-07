package com.example.kelseyde.cardgame;


import java.lang.reflect.Array;
import java.util.*;

public class Player {

    private ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<Card>() ;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void takeCard(Card card) {
        hand.add(card);
    }
}
