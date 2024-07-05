package org.example;

import java.util.List;

public class Game {
    private List<Player> players;
    private Croupier croupier;

    public Game(List<Player> players, Croupier croupier) {
        this.players = players;
        this.croupier = croupier;
    }
}
