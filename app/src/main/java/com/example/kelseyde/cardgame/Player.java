package com.example.kelseyde.cardgame;


public class Player {

    private CardType card;

    public Player() {
        this.card = null;
    }

    public CardType getCard() {
        return card;
    }

    public void setCard(CardType card) {
        this.card = card;
    }

}
