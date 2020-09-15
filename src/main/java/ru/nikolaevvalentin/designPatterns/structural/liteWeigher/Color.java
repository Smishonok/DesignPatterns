package ru.nikolaevvalentin.designPatterns.structural.liteWeigher;

import java.util.Objects;

public class Color {
    private String colorCode;

    public Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Color color = (Color) o;
        return Objects.equals(colorCode, color.colorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorCode);
    }
}
