package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class RedWoodTable implements Table {

    private String name = "Red wood table";
    private int price = 41_200;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
