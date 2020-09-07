package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employ;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Tester;

public class JavaTester extends Employ implements Tester {

    public JavaTester(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void testCode() {
        System.out.println("Banking tester tests java code.");
    }

    @Override
    public void work() {
        testCode();
    }
}
