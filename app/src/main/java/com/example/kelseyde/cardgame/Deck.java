package com.example.kelseyde.cardgame;

import java.util.*;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = null;
    }

    //getters and setters

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    //methods


    public void newDeck() {
        Card card;

        ArrayList<Card> deck = new ArrayList<Card>();

        ArrayList<SuitType> suits =
                new ArrayList<SuitType>(EnumSet.allOf(SuitType.class));

        ArrayList<CardType> cardTypes =
                new ArrayList<CardType>(EnumSet.allOf(CardType.class));

        for(SuitType suit : suits) {
            for (CardType value : cardTypes) {
                card = new Card(suit, value);
                deck.add(card);
            }
        }
        this.deck = deck;
    }

    public void dealCards(ArrayList<Player> players) {
        Collections.shuffle(deck);
        for (Player player : players) {
            player.takeCard(deck.get(0));
            deck.remove(0);
        }
    }

    public void compareCards(ArrayList<Player> players) {

    }
}
