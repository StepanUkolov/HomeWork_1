package com.project;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();
        box.addItem(new Candy("Конфета", 120.0, 234.0, Color.BLACK));
        box.addItem(new Bubblegum("Жевачка", 25.0, 100.5, new Volume(12)));
        box.addItem(new Chocolate("Шоколадка", 130.5, 45.7, 6));
        box.addItem(new Jellybean("Мармеладка", 478.3, 89.4, Country.UKRAINE));


        System.out.println("Тест №1 - Вывод на экран информации");
        System.out.println("Цена подарка = " + box.boxPrice() + " руб.");                         //Цена подарка
        System.out.println("Общий вес подарка = " + box.boxWeight() + " гр.");                    //Вес подарка
        box.boxInfo();                                                                            //Содержимое подарка


        System.out.println("Тест №2 - Удаляем предмет с индексом 2");
        box.deleteItem(2);                //Удаляем элемент с индексом 2
        System.out.println("Цена подарка = " + box.boxPrice() + " руб.");
        System.out.println("Общий вес подарка = " + box.boxWeight() + " гр.");
        box.boxInfo();


        System.out.println("Тест №3 - Добавляем новый предмет (Другая конфета)");
        box.addItem(new Candy("Другая конфета", 123.4, 321.6, Color.BLUE));   //Добавляем новый предмет
        System.out.println("Цена подарка = " + box.boxPrice() + " руб.");
        System.out.println("Общий вес подарка = " + box.boxWeight() + " гр.");
        box.boxInfo();


        System.out.println("Тест №4 - Удаляем последний элемент");
        box.deleteItem();                       //Удаляем последний элемент
        System.out.println("Цена подарка = " + box.boxPrice() + " руб.");
        System.out.println("Общий вес подарка = " + box.boxWeight() + " гр.");
        box.boxInfo();


        System.out.println("Тест №5 - Проверяем метод reducePrice(double price)");
        box.reducePrice(400.0);                 //Удаляем элемент с самой маленькой ценой, пока коробка не будет стоить 400 руб.
        System.out.println("Цена подарка = " + box.boxPrice() + " руб.");
        System.out.println("Общий вес подарка = " + box.boxWeight() + " гр.");
        box.boxInfo();


        System.out.println("Тест №6 - Проверяем метод reduceWeight(double weight)");
        box.reduceWeight(130.0);                //Удаляем элемент с самым маленьким весом, пока коробка не будет весить 500 гр.
        System.out.println("Цена подарка = " + box.boxPrice() + " руб.");
        System.out.println("Общий вес подарка = " + box.boxWeight() + " гр.");
        box.boxInfo();


    }
}
