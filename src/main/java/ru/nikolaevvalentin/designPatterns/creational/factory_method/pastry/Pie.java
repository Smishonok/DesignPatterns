package ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry;

public class Pie implements Pastry {

    @Override
    public String getRecipe() {
        return "I`m little little pie! Eat me and you will be fine!";
    }
}
