package org.example;

import java.util.Collections;

public class Croupier {

    private CardPackage cardPackage;

    public Croupier() {
        this.cardPackage = new CardPackage();
    }

    public void mix(){ //methode pour melanger les cartes
        Collections.shuffle(cardPackage.getCards());
    }

    public Card giveCard(){ //methode pour distribuer les cartes
        Card card = cardPackage.getCards().getFirst();
        cardPackage.getCards().removeFirst();
        return card;
    }
}


