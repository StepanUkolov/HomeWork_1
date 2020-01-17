package com.project;

public class Bubblegum extends SweetStuff {
    private Volume volume;

    public Bubblegum(String name, double weight, double price, Volume volume) {
        super(name, weight, price);
        this.volume = volume;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }
}
