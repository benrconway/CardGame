package com.example.kelseyde.cardgame;

import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class GameTest {

    Player player1;
    Player player2;
    Player player3;
    ArrayList<Player> players;
    Game game;

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
    }

    @Test
    public void testHasPlayers() {
        assertEquals(3, game.getPlayers().size());
    }

    @Test
    public void testNewDeck() {
        game.newDeck();
        assertEquals(52, game.getDeck().size() );
    }



}