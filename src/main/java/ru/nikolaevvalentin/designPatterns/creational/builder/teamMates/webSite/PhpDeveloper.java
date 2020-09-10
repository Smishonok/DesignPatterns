package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.webSite;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Developer;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employee;

public class PhpDeveloper extends Employee implements Developer {
    public PhpDeveloper(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code.");
    }

    @Override
    public void work() {
        writeCode();
    }
}
