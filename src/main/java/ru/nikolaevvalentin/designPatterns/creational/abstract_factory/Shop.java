package ru.nikolaevvalentin.designPatterns.creational.abstract_factory;

import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.factories.FurnitureFactory;
import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.Chair;
import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.Sofa;
import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.prodacts.Table;


public class Shop {
    private Chair chair;
    private Sofa  sofa;
    private Table table;

    public Shop(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.sofa  = furnitureFactory.createSofa();
        this.table = furnitureFactory.createTable();
    }

    public String getFurniturePrice() {
        return "Furniture cost: \n" + chair.getName() + ": " + chair.getPrice() + "$\n" +
                sofa.getName() + ":" + " " + sofa.getPrice() + "$\n" + table.getName() + ": " +
                table.getPrice() + "$";
    }
}
