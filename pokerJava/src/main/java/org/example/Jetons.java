package org.example;

public class Jetons {
    private int num;

    public Jetons(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "jeton qui vaut : "+this.num;
    }
}
