package ru.nikolaevvalentin.designPatterns.structural.breidge;

public class GreenColor implements Color {
    String color;

    public GreenColor() {
        this.color = "green";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

