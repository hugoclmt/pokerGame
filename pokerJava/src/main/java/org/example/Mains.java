package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mains {
    List<Card> cards = new ArrayList<>();

    public Mains()
    {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card)
    {
        this.cards.add(card);
    }

    public List<Card> getCards()
    {
        return this.cards;
    }

    public void clear()
    {
        this.cards.clear();
    }

    public boolean isPair()
    {
        if (this.cards.size() != 2)
        {
            return false;
        }
        return this.cards.get(0).getRank() == this.cards.get(1).getRank();
    }

    public boolean isBrelan(List<Card> paquetDeJeu)
    {
        if (this.cards.size() != 2)
        {
            return false;
        }
        int count = 0;
        for (Card card : paquetDeJeu)
        {
            if (card.getRank() == this.cards.get(0).getRank())
            {
                count++;
            }
        }
        return count == 3;
    }

    public boolean isQuinte(List<Card> paquetDeJeu)
    {
        if (this.cards.size() != 2)
        {
            return false;
        }
        int count = 0;
        for (Card card : paquetDeJeu)
        {
            if (card.getRank() == this.cards.get(0).getRank() + 1)
            {
                count++;
            }
        }
        return count == 4;
    }

public boolean isCarre(List<Card> paquetDeJeu)
    {
        if (this.cards.size() != 2)
        {
            return false;
        }
        int count = 0;
        for (Card card : paquetDeJeu)
        {
            if (card.getRank() == this.cards.get(0).getRank())
            {
                count++;
            }
        }
        return count == 4;
    }

    public boolean isFull(List<Card> paquetDeJeu)
    {
        if (this.cards.size() != 2)
        {
            return false;
        }
        int count = 0;
        for (Card card : paquetDeJeu)
        {
            if (card.getRank() == this.cards.get(0).getRank())
            {
                count++;
            }
        }
        return count == 3;
    }

    public boolean isQuinteFlush(List<Card> paquetDeJeu)
    {
        if (this.cards.size() != 2)
        {
            return false;
        }
        int count = 0;
        for (Card card : paquetDeJeu)
        {
            if (card.getRank() == this.cards.get(0).getRank() + 1)
            {
                count++;
            }
        }
        return count == 4;
    }
}
