package ru.nikolaevvalentin.designPatterns.creational.factory_method.pastry;

public class Doughnut implements Pastry {

    @Override
    public String getRecipe() {
        return "Mmmmm, I`m doughnut!";
    }
}
