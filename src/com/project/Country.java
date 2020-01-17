package com.project;

public enum Country {

    RUSSIA("Russia"),
    USA("United States"),
    UKRAINE("Ukraine");

    private String country;
    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
