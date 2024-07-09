package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player{
    private String name;
    private List<Card> mains;
    private List<Jetons> jetons;

    public Player(String name,List<Jetons>jetons) {
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

    public List<Jetons> getJetons() {
        return jetons;
    }

    public int getJetonsValue(){
        int value = 0;
        for (Jetons jeton : jetons) {
            value += jeton.getValue();
        }
        return value;
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
