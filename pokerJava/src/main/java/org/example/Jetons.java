package org.example;

public abstract class Jetons {
    private int value;

    public Jetons(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "jeton qui vaut : "+this.value;
    }
}
