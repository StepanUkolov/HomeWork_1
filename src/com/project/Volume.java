package com.project;

public class Volume {
    private int radius;

    public Volume(int radius) {
        this.radius = radius;
    }

    public double volumeCalculate() {
        return Math.pow((double) radius, 3) * Math.PI;
    }

    public int getRadius() {
        return radius;
    }
}
