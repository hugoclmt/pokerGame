package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jetons jetons = new Jetons(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de joueurs : ?");
        int nbPlayers = sc.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < nbPlayers; i++) {
            System.out.println("Nom du joueur " + (i + 1) + " : ");
            String name = sc.next();
            Player player = new Player(name,jetons);
            players.add(player);
        }

        Croupier croupier = new Croupier();
        Game game = new Game(players, croupier);
        game.start();

    }
}