package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Developer;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employ;

public class JavaDeveloper extends Employ implements Developer {

    public JavaDeveloper(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }

    @Override
    public void work() {
        writeCode();
    }
}
