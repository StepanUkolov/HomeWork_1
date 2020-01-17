package com.project;

import java.util.ArrayList;
import java.util.List;

public class Box implements Packagable {

    private List<SweetStuff> sweetsList = new ArrayList<SweetStuff>();

    @Override
    public void addItem(SweetStuff sweet) {
        sweetsList.add(sweet);
    }

    @Override
    public void deleteItem(int index) {
        sweetsList.remove(index);
    }

    @Override
    public void deleteItem() {
        sweetsList.remove(sweetsList.size() - 1);
    }

    @Override
    public double boxWeight() {
        int weight = 0;
        for (SweetStuff sweet : sweetsList) {
            weight += sweet.getWeight();
        }
        return weight;
    }

    @Override
    public double boxPrice() {
        int price = 0;
        for (SweetStuff sweet : sweetsList) {
            price += sweet.getPrice();
        }
        return price;
    }

    @Override
    public void boxInfo() {
        System.out.println("-------------------------------");
        System.out.println("Содержимое подарка:");
        for (SweetStuff sweet : sweetsList) {
            System.out.println(sweet.getName() + "\t" + sweet.getPrice() + " руб.  " + sweet.getWeight() + " гр.");
        }
        System.out.println("-------------------------------" + "\n");
    }

    public void reduceWeight(double weight) {

        while (weight < boxWeight()) {
            SweetStuff lightestSweet = sweetsList.get(0);
            int index = 0;
            for (int i = 1; i < sweetsList.size(); i++) {
                if (lightestSweet.getWeight() > sweetsList.get(i).getWeight()) {
                    lightestSweet = sweetsList.get(i);
                    index = i;
                }
            }
            sweetsList.remove(index);
        }
    }

    public void reducePrice(double price) {

        while (price < boxPrice()) {
            SweetStuff cheapestSweet = sweetsList.get(0);
            int index = 0;
            for (int i = 1; i < sweetsList.size(); i++) {
                if (cheapestSweet.getPrice() > sweetsList.get(i).getPrice()) {
                    cheapestSweet = sweetsList.get(i);
                    index = i;
                }
            }
            sweetsList.remove(index);
        }
    }
}
