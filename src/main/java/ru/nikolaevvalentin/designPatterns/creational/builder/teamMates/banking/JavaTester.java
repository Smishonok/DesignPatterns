package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employee;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Tester;

public class JavaTester extends Employee implements Tester {

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
