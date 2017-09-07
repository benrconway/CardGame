package com.example.kelseyde.cardgame;

import java.util.ArrayList;
import java.util.EnumSet;

public class Game {

    private ArrayList<Card> deck;
    private ArrayList<Player> players;

    public Game(ArrayList<Player> players) {
        this.deck = null;
        this.players = players;
    }

    //getters and setters

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
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



}

