package ru.nikolaevvalentin.designPatterns.structural.liteWeigher;

import java.math.BigInteger;
import java.util.Objects;

public class LeafWithHoles implements Sprite {
    private BigInteger bigInteger = BigInteger
            .valueOf(9000000000324423421L)
            .add(BigInteger.valueOf(9000000000324423421L))
            .add(BigInteger.valueOf(9000000000324423421L))
            .add(BigInteger.valueOf(9000000000324423421L));


    @Override
    public String getSprite() {
        return "Leaf with holes";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LeafWithHoles that = (LeafWithHoles) o;
        return Objects.equals(bigInteger, that.bigInteger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bigInteger);
    }
}
