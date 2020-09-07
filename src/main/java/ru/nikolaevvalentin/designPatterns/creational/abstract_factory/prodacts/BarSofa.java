package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class BarSofa implements Sofa {

    private String name = "Bar sofa";
    private int price = 25_300;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
