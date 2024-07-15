package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Croupier croupier;
    private List<Card> cardsOnTable;
    private List<Jetons> sommeTotalJetons = new ArrayList<>();

    public Game(List<Player> players, Croupier croupier) {
        this.players = players;
        this.croupier = croupier;
        this.cardsOnTable = new ArrayList<>();
    }

    public void start()
    {
        this.croupier.mix();
        distributeCardsJoueurs(2);
        //action des joueurs à définir
        
        distributeCardsTable(3);
        afficherCartesTables();
        //Action des joueurs à définir
        distributeCardsTable(1);
        afficherCartesTables();
        //Action des joueurs à définir
        distributeCardsTable(1);
        afficherCartesTables();
        //Action des joueurs à définir
    }

    private void distributeCardsJoueurs(int nbreDeCartes)
    {
        for (int i = 0; i < nbreDeCartes; i++) {
            for (Player player : this.players) {
                player.addCard(this.croupier.giveCard());
            }
        }
    }

    private void distributeCardsTable(int nbreDeCartes)
    {
        for (int i = 0; i < nbreDeCartes; i++) {
            this.cardsOnTable.add(this.croupier.giveCard());
        }
    }

    private void afficherCartesTables(){
        System.out.println("Cartes sur la table : ");
        for (Card card : this.cardsOnTable) {
            System.out.println(card);
        }
    }
}
  