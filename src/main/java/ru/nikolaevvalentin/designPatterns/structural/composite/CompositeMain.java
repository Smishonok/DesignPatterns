package ru.nikolaevvalentin.designPatterns.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        Box surpriseBox1 = new Box(1);
        Box surpriseBox2 = new Box(121);
        Box surpriseBox3 = new Box(302);

        BigSurprise bigSurprise = new BigSurprise("Yuooo-Ho-Ho");
        surpriseBox1.addBox(surpriseBox2);
        surpriseBox2.addBox(surpriseBox3);
        surpriseBox2.addBox(new Box(548));
        surpriseBox3.addBox(bigSurprise);

        System.out.println(surpriseBox1.getNumberOfSurprises());

    }
}
