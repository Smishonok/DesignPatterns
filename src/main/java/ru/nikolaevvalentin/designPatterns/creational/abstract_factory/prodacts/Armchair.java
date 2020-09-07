package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class Armchair implements Chair {

    private String name = "Armchair";
    private int price = 17_300;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
