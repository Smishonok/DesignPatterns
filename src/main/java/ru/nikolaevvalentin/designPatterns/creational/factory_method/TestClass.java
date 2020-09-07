package ru.nikolaevvalentin.designPatterns.creational.factory_method;

import ru.nikolaevvalentin.designPatterns.creational.factory_method.bakery.Bakery;
import ru.nikolaevvalentin.designPatterns.creational.factory_method.bakery.CakeBakery;
import ru.nikolaevvalentin.designPatterns.creational.factory_method.bakery.DoughnutBakery;
import ru.nikolaevvalentin.designPatterns.creational.factory_method.bakery.PieBakery;

public class TestClass {

    private static Bakery bakery;

    private static void initialiseBakery(String type){
        type = type.toLowerCase();
        switch (type) {
            case "cake":
                bakery = new CakeBakery();
                break;
            case "doughnut":
                bakery = new DoughnutBakery();
                break;
            case "pie":
                bakery = new PieBakery();
                break;
            default:
                throw new IllegalArgumentException("Illegal bakery type.");
        }
    }

    public static void main(String[] args) {
        initialiseBakery("cake");
        String pastryRecipe = bakery.getPastry().getRecipe();
        System.out.println(pastryRecipe);
    }
}
