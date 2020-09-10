package ru.nikolaevvalentin.designPatterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Seller seller = new MusicSeller();
        Buyer buyer = new Adapter(seller);

        buyer.getInformationAboutProduct();
        buyer.payForGoods(100);
        System.out.println(
                "Seller receive money from buyer and it`s new balance:" + seller.getBalance());
        buyer.takeProduct();


    }


}
