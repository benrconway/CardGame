package com.example.kelseyde.cardgame;


public enum CardType {

    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(6),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12),
    ACE(13);

    private int value;

    CardType(int value) {
        this.value = value;
    }
}


//List<Foo> list = createItSomehow();
//Collections.shuffle(list);
//Foo foo = list.get(0);