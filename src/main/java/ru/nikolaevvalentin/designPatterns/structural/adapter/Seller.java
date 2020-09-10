package ru.nikolaevvalentin.designPatterns.structural.adapter;

public interface Seller {

    void packProduct();

    void getMoney(int number);

    String tellsAboutProduct();

    int getBalance();
}
