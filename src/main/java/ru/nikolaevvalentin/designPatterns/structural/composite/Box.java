package ru.nikolaevvalentin.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Surprise {
    private int numberOfSurprises;
    private List<Surprise> boxes = new ArrayList<>();

    public Box(int numberOfSurprises) {
        this.numberOfSurprises = numberOfSurprises;
    }

    void addBox(Surprise box) {
        boxes.add(box);
    }

    @Override
    public int getNumberOfSurprises() {
        return numberOfSurprises + boxes
                .stream()
                .map(Surprise::getNumberOfSurprises)
                .reduce(0, Integer::sum,Integer::sum);
    }
}
