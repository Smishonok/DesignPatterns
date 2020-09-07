package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.webSite;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employ;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Tester;

public class PhpTester extends Employ implements Tester {
    public PhpTester(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void testCode() {
        System.out.println("PHP tester tests php code");
    }

    @Override
    public void work() {
        testCode();
    }
}
