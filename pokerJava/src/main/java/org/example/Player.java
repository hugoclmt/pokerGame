package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> mains;
    private Jetons jetons;

    public Player(String name, Jetons jetons) {
        this.name = name;
        this.mains = new ArrayList<>();
        this.jetons = jetons;
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

    public Jetons getJetons() {
        return jetons;
    }

    public void setJetons(Jetons jetons) {
        this.jetons = jetons;
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
