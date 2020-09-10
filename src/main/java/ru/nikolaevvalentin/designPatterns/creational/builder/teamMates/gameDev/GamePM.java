package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.gameDev;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employee;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.ProjectManager;

public class GamePM extends Employee implements ProjectManager {
    public GamePM(int monthSalary) {
        super(monthSalary);
    }

    @Override
    public void manegeProject() {
        System.out.println("Game PM maneges game project.");
    }

    @Override
    public void work() {
        manegeProject();
    }
}
