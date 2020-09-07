package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class LeatherChair implements Chair {

    private String name = "Leather chair";
    private int price = 21_600;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
