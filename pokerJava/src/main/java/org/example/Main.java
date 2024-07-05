package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Croupier croupier = new Croupier();
        croupier.mix();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        List<Player> players = List.of(player1, player2);

        for (Player player : players) {
            for (int i = 0; i < 2; i++) {
                player.addCard(croupier.giveCard());
            }
        }

        for (Player player : players) {
            System.out.println(player.getName() + ":");
            for (Card card : player.getMains()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}