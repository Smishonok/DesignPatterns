package ru.nikolaevvalentin.designPatterns.structural.breidge;

public class RedColor implements Color {
    String color;

    public RedColor() {
        this.color = "red";
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
