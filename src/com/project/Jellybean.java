package com.project;

public class Jellybean extends SweetStuff {
    private Country country;

    public Jellybean(String name, double weight, double price, Country country) {
        super(name, weight, price);
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
