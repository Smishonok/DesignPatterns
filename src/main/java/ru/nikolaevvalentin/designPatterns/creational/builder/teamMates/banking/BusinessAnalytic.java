package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Analytic;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employ;

public class BusinessAnalytic extends Employ implements Analytic {
    public BusinessAnalytic(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void analyse() {
        System.out.println("Business analytic analyses market data in banking project.");
    }

    @Override
    public void work() {
        analyse();
    }
}
