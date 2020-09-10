package ru.nikolaevvalentin.designPatterns.structural.liteWeigher;

import java.math.BigInteger;

public class HalfLeaf implements Sprite {
    private BigInteger bigInteger = BigInteger
            .valueOf(9000000000324423421L)
            .add(BigInteger.valueOf(9000000000324423421L))
            .add(BigInteger.valueOf(9000000000324423421L));



    @Override
    public String getSprite() {
        return "Half leaf";
    }
}
