package ru.nikolaevvalentin.designPatterns.structural.composite;

public class BigSurprise implements Surprise {
    private String surpriseName;

    public BigSurprise(String surpriseName) {
        this.surpriseName = surpriseName;
    }

    @Override
    public int getNumberOfSurprises() {
        return 1;
    }
}
