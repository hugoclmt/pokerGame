package org.example;

public enum Suit {
    Coeur("Rouge"),
    Pique("Noir"),
    Trefles("Noir"),
    Carreau("Rouge");

    private String color;

    Suit(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
