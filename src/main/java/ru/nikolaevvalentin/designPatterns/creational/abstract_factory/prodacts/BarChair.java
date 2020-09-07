package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class BarChair implements Chair {

    private String name = "Bar chair";
    private int price = 7_200;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
