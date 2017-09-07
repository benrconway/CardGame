package com.example.kelseyde.cardgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {

    Player player1;
    Player player2;
    Player player3;
    ArrayList<Player> players;
    Game game;
    Deck deck;

    @Before

    public void before() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        players = new ArrayList();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        game = new Game(players);
        deck = new Deck();
    }

    @Test
    public void testHasPlayers() {
        assertEquals(3, game.getPlayers().size());
    }

    @Test
    public void testNewDeck() {
        deck.newDeck();
        assertEquals(52, deck.getDeck().size() );
    }

    @Test
    public void testFirstCard() {
        deck.newDeck();
        assertEquals(SuitType.DIAMONDS, deck.getDeck().get(0).getSuit());
        assertEquals(CardType.TWO, deck.getDeck().get(0).getValue());
    }

    @Test
    public void testDeal() {
        deck.newDeck();
        deck.dealCards(players);
        assertEquals(49, deck.getDeck().size());
        assertEquals(1, game.getPlayers().get(0).getHand().size());
    }





}