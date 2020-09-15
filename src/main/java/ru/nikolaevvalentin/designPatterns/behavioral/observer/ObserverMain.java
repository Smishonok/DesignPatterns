package ru.nikolaevvalentin.designPatterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        ListenerManager manager = new ListenerManager();
        Shop shop = new Shop(manager);

        Customer coffeeMan = new Customer(shop, manager, "coffee", 150);
        Customer coffeeMan2 = new Customer(shop, manager, "coffee", 100);
        Customer sugarEater = new Customer(shop, manager, "sugar", 500);

        shop.addGoodsToWareHouse("coffee", 150);
        shop.addGoodsToWareHouse("sugar", 300);
        shop.addGoodsToWareHouse("coffee", 300);
        shop.addGoodsToWareHouse("coffee", 300);
        shop.addGoodsToWareHouse("sugar", 300);
    }
}
