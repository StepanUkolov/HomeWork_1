package com.project;

import java.awt.*;

public class Candy extends SweetStuff {
    private Color color;

    public Candy(String name, double weight, double price, Color color) {
        super(name, weight, price);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
