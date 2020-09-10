package ru.nikolaevvalentin.designPatterns.structural.liteWeigher;

public class Leaf {
    private int length;
    private int width;
    private int x;
    private int y;
    private Sprite sprite;
    private Color color;

    public Leaf(int length, int width, int x, int y, Sprite sprite, Color color) {
        this.length = length;
        this.width  = width;
        this.x      = x;
        this.y      = y;
        this.sprite = sprite;
        this.color  = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Leaf{" + "length=" + length + ", width=" + width + ", x=" + x + ", y=" + y +
               ", sprite=" + sprite.getSprite() + ", color=" + color.getColorCode() + '}';
    }

    public static class LeafBuilder{
        private Leaf leaf;

        public LeafBuilder() {
            leaf = new Leaf(0, 0, 0, 0, null, null);
        }

        public LeafBuilder setLength(int length) {
            leaf.setLength(length);
            return this;
        }
    }
}
