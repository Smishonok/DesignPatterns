package ru.nikolaevvalentin.designPatterns.structural.adapter;

public class Adapter implements Buyer {

    private Seller seller;

    public Adapter(Seller seller) {
        this.seller = seller;
    }

    @Override
    public void payForGoods(int money) {
        seller.getMoney(money);
    }

    @Override
    public void takeProduct() {
        seller.packProduct();
    }

    @Override
    public void getInformationAboutProduct() {
        System.out.println(seller.tellsAboutProduct());
    }
}
