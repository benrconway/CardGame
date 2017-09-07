package com.example.kelseyde.cardgame;

import java.util.ArrayList;
import java.util.Collections;
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

    public Player getWinner(ArrayList<Player> players) {
        Player winner = null;
        int highest = 0;
        for (Player player : players) {
            int cardValue = player.getHand().get(0).getValue().ordinal();
            if ( cardValue > highest ) {
                winner = player;
                highest = player.getHand().get(0).getValue().ordinal();
            }
        }
        return winner;
    }



}

