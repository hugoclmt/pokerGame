package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        List<Jetons> jetons = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            jetons.add(new JetonBlanc());
        }
        for (int i = 0; i < 4; i++) {
            jetons.add(new JetonRouge());
        }
        for (int i = 0; i < 3; i++) {
            jetons.add(new JetonBleu());
        }
        for (int i = 0; i < 2; i++) {
            jetons.add(new JetonVert());
        }
        for (int i = 0; i < 1; i++) {
            jetons.add(new JetonNoir());
        }

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













