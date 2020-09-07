package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class DiningTable implements Table {

    private String name = "Dining table";
    private int price = 14_500;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }


}
