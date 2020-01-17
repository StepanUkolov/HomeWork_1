package com.project;

public interface Packagable {
    void addItem(SweetStuff sweet);

    void deleteItem(int index);

    void deleteItem();

    double boxWeight();

    double boxPrice();

    void boxInfo();
}
