package ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts;

public class SoftSofa implements Sofa {

    private String name = "Soft sofa";
    private int price = 12_900;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
