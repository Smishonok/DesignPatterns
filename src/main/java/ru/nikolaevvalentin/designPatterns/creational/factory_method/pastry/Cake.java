package ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry;

public class Cake implements Pastry {

    @Override
    public String getRecipe() {
        return "I`m tasty cake!";
    }
}
