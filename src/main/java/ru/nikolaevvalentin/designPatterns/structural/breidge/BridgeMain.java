package ru.nikolaevvalentin.designPatterns.structural.breidge;

public class BridgeMain {
    public static void main(String[] args) {
        Shape sphere = new Shape();
        Color color = new RedColor();
        sphere.setType(Type.SPHERE);
        sphere.setColor(color);
        System.out.println(sphere);
        color.setColor("red color");
        System.out.println(sphere);
    }
}
