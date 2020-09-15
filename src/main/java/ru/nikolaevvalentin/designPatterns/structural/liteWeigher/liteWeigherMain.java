package ru.nikolaevvalentin.designPatterns.structural.liteWeigher;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class liteWeigherMain {
    public static void main(String[] args) throws InterruptedException {

        long memoryBeforeTest = Runtime
                .getRuntime()
                .totalMemory();
        System.out.println(
                String.format("JVM allocated memory before test: %,d k", memoryBeforeTest / 1000));
        FullLeaf fullLeaf = new FullLeaf();
        HalfLeaf halfLeaf = new HalfLeaf();
        LeafWithHoles leafWithHoles = new LeafWithHoles();
        Color green = new Color("greenCode");
        Color red = new Color("redCode");
        Color yellow = new Color("yellowCode");

//        LeafFactory factory = new LeafFactory();
//        List<Leaf> liteLeafs = new ArrayList<>();
//        for (int i = 0; i < 10_000_000; i++) {
//            liteLeafs.add(factory.getLeaf(i,i,i,i,new FullLeaf(),new Color("greenCode")));
//        }
//        for (int i = 0; i < 10_000_000; i++) {
//            liteLeafs.add(factory.getLeaf(i, i, i, i, new HalfLeaf(), new Color("redCode")));
//        }
//        for (int i = 0; i < 10_000_000; i++) {
//            liteLeafs.add(factory.getLeaf(i, i, i, i, new LeafWithHoles(), new Color("yellowCode")));
//        }
//
//        TimeUnit.SECONDS.sleep(5);

        long memoryWithLiteWeigher = Runtime
                .getRuntime()
                .totalMemory();
        System.out.println(String.format("JVM allocated memory after creating lite weigher: %,d k",
                                         memoryWithLiteWeigher / 1000));
        System.out.println(String.format("Difference: %,d k",
                                         (memoryWithLiteWeigher - memoryBeforeTest) / 1000));

        TimeUnit.SECONDS.sleep(5);

        List<Leaf> heavyLeafs = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            heavyLeafs.add(new Leaf(i, i, i, i, new FullLeaf(), new Color("greenCode")));
        }
        for (int i = 0; i < 10_000_000; i++) {
            heavyLeafs.add(new Leaf(i, i, i, i, new HalfLeaf(), new Color("redCode")));
        }
        for (int i = 0; i < 10_000_000; i++) {
            heavyLeafs.add(new Leaf(i, i, i, i, new LeafWithHoles(), new Color("yellowCode")));
        }

        long memoryWithHeavyWeigher = Runtime
                .getRuntime()
                .totalMemory();
        System.out.println(String.format("JVM allocated memory after creating heavy weigher: %,d k",
                                         memoryWithHeavyWeigher / 1000));
        System.out.println(String.format("Difference: %,d k",
                                         (memoryWithHeavyWeigher - memoryWithLiteWeigher) / 1000));

//        System.out.println(liteLeafs.size());
        System.out.println(heavyLeafs.size());
    }
}
