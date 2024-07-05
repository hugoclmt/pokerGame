package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> mains;

    public Player(String name) {
        this.name = name;
        this.mains = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.mains.add(card);
    }

    public List<Card> getMains() {
        return mains;
    }

    public String getName() {
        return name;
    }

    public void check(){ //methode pour suivre
        //TODO

    }

    public void bet() //methode pour miser
    {
        //TODO
    }

    public void fold() //methode pour se coucher
    {
        //TODO
    }

}
