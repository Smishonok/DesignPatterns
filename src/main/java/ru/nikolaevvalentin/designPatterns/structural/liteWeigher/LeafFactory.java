package ru.nikolaevvalentin.designPatterns.structural.liteWeigher;

import java.util.HashSet;
import java.util.Set;

public class LeafFactory {

    private Set<Sprite> sprites = new HashSet<>();
    private Set<Color> colors = new HashSet<>();

    public Leaf getLeaf(int length, int width, int x, int y, Sprite sprite, Color color) {
        Sprite spriteForLeaf;
        if (sprites.contains(sprite)) {
            spriteForLeaf = sprites
                    .stream()
                    .filter(sprite::equals)
                    .findFirst()
                    .get();
        } else {
            sprites.add(sprite);
            spriteForLeaf = sprite;
        }

        Color leafColor;
        if (colors.contains(color)) {
            leafColor = colors
                    .stream()
                    .filter(color::equals)
                    .findFirst()
                    .orElse(color);
        } else {
            colors.add(color);
            leafColor = color;
        }

        return new Leaf(length, width, x, y, spriteForLeaf, leafColor);
    }
}
