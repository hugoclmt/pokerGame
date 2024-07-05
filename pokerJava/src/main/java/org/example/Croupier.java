package org.example;

import java.util.Collections;

public class Croupier {

    private CardPackage cardPackage;

    public Croupier() {
        this.cardPackage = new CardPackage();
    }

    public void mix(){
        Collections.shuffle(cardPackage.getCards());
    }

    public Card giveCard(){
        Card card = cardPackage.getCards().getFirst();
        cardPackage.getCards().removeFirst();
        return card;
    }
}


