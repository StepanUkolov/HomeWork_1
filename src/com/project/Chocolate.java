package com.project;

public class Chocolate extends SweetStuff {
    private int numberOfTiles;

    public Chocolate(String name, double weight, double price, int numberOfTiles) {
        super(name, weight, price);
        this.numberOfTiles = numberOfTiles;
    }

    public int getNumberOfTiles() {
        return numberOfTiles;
    }

    public void setNumberOfTiles(int numberOfTiles) {
        this.numberOfTiles = numberOfTiles;
    }
}
