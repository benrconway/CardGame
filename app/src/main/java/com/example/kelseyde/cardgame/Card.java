package com.example.kelseyde.cardgame;
import java.util.*;

public class Card {

    private CardType value;
    private SuitType suit;

    public Card(SuitType suit, CardType value){
        this.suit = suit;
        this.value = value;
    }

    public CardType getValue() {
        return value;
    }

    public SuitType getSuit() {
        return suit;
    }






}

