package org.example;

import java.util.ArrayList;
import java.util.List;

public class CardPackage {

    private List<Card> cards = new ArrayList<>();

    public CardPackage() {
        for(Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }
}
