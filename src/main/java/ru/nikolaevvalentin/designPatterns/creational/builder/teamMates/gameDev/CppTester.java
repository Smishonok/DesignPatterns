package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.gameDev;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employee;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Tester;

public class CppTester extends Employee implements Tester {

    public CppTester(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void testCode() {
        System.out.println("C++ tester tests c++ code.");
    }

    @Override
    public void work() {
        testCode();
    }
}
