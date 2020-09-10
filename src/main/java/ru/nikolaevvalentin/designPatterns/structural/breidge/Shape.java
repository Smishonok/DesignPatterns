package ru.nikolaevvalentin.designPatterns.structural.breidge;

public class Shape {
    private Color color;
    private Type type;

    public Shape() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color.getColor() + ", type=" + type + '}';
    }
}
