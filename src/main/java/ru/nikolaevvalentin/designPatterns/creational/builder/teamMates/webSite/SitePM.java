package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.webSite;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employee;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.ProjectManager;

public class SitePM extends Employee implements ProjectManager {
    public SitePM(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void manegeProject() {
        System.out.println("Web PM maneges web site project.");
    }

    @Override
    public void work() {
        manegeProject();
    }
}
