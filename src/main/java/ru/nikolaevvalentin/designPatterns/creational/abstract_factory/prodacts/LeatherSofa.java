package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class LeatherSofa implements Sofa {

    private String name = "Leather sofa";
    private int price = 41_300;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
