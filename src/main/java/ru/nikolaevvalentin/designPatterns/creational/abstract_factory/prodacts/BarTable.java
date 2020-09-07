package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class BarTable implements Table {

    private String name = "Bar table";
    private int price = 9_400;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }


}
