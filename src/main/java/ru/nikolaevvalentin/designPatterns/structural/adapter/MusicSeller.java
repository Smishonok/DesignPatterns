package ru.nikolaevvalentin.designPatterns.structural.adapter;

public class MusicSeller implements Seller {
    private int money = 0;

    public MusicSeller() {
    }

    @Override
    public void packProduct() {
        System.out.println("Pack the music disc into box and send to buyer.");
    }

    @Override
    public void getMoney(int number) {
        money += number;
    }

    @Override
    public String tellsAboutProduct() {
        return "This is the album of the most popular group nowadays and this is the best selling" +
               " album!";
    }

    @Override
    public int getBalance() {
        return money;
    }
}
