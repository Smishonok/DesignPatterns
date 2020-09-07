package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.gameDev;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Developer;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employ;

public class CppDeveloper extends Employ implements Developer {

    public CppDeveloper(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code.");
    }

    @Override
    public void work() {
        writeCode();
    }
}
