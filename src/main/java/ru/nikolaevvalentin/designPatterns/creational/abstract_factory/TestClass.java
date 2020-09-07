package ru.nikolaevvalentin.designPatterns.creational.abstract_factory;

import ru.nikolaevvalentin.designPatterns.creational.abstract_factory.factories.DinnerRoomFurnitureFactory;

public class TestClass {

    public static void main(String[] args) {
        Shop furnitureShop = new Shop(new DinnerRoomFurnitureFactory());
        String furniturePrice = furnitureShop.getFurniturePrice();
        System.out.println(furniturePrice);

    }


}

