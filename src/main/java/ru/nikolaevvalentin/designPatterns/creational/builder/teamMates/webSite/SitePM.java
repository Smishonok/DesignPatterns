package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.webSite;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employ;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.ProjectManager;

public class SitePM extends Employ implements ProjectManager {
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
