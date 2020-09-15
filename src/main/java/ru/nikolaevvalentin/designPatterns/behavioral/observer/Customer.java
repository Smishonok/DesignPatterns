package ru.nikolaevvalentin.designPatterns.behavioral.observer;

import java.util.Objects;

public class Customer implements Listener {

    private Shop shop;
    private ListenerManager listenerManager;
    private String nameOfNeededProduct;
    private int quantityOfNeededProduct;
    private int id;
    private static int lastId = 0;

    public Customer(Shop shop, ListenerManager listenerManager, String nameOfNeededProduct,
                    int quantityOfNeededProduct) {
        this.nameOfNeededProduct     = nameOfNeededProduct;
        this.quantityOfNeededProduct = quantityOfNeededProduct;
        this.shop = shop;
        this.listenerManager = listenerManager;
        this.id = ++lastId;
        listenerManager.subscribe(nameOfNeededProduct,this);
        System.out.println("Customer "+id+" set subscription on new delivery of "+nameOfNeededProduct);
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public ListenerManager getListenerManager() {
        return listenerManager;
    }

    public void setListenerManager(ListenerManager listenerManager) {
        this.listenerManager = listenerManager;
    }

    @Override
    public void update() {
        System.out.println("Customer "+id+": Received the notification about " + nameOfNeededProduct + " " +
                           "delivery in shop.");
        int quantityOfGoodsCanToBuy = shop.getGoods(nameOfNeededProduct, quantityOfNeededProduct);
        quantityOfNeededProduct -= quantityOfGoodsCanToBuy;
        System.out.println("Customer "+id+": buy "+ quantityOfGoodsCanToBuy +" of "+ nameOfNeededProduct);
        if (quantityOfNeededProduct == 0) {
            listenerManager.unsubscribe(this);
            System.out.println("Customer "+id+": unsubscribe from shop.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
               Objects.equals(nameOfNeededProduct, customer.nameOfNeededProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfNeededProduct, id);
    }
}
