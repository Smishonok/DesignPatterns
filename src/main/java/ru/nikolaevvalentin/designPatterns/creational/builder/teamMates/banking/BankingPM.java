package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.banking;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employee;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.ProjectManager;

public class BankingPM extends Employee implements ProjectManager {

    public BankingPM(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void manegeProject() {
        System.out.println("Banking PM maneges banking project");
    }

    @Override
    public void work() {
        manegeProject();
    }
}
