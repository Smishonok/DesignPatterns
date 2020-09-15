package ru.nikolaevvalentin.designPatterns.behavioral.observer;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    private ListenerManager listenerManager;
    private Map<String, Integer> wareHouse;

    public Shop(ListenerManager listenerManager) {
        this.listenerManager = listenerManager;
        wareHouse            = new HashMap<>();
    }

    public int getGoods(String productName, int quantity) {
        int goodsForSellByOrder;
        if (wareHouse.get(productName) != null) {
            goodsForSellByOrder = Math.min(wareHouse.get(productName), quantity);
            wareHouse.put(productName, wareHouse.get(productName) - goodsForSellByOrder);
        } else {
            goodsForSellByOrder = 0;
        }
        return goodsForSellByOrder;
    }

    public void addGoodsToWareHouse(String productName, int quantity) {
        System.out.println("In the shop new delivery of " + productName);
        wareHouse.put(productName, quantity);
        listenerManager.notifyListeners(productName);
    }
}
