package ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.gameDev;

import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.Employ;
import ru.nikolaevvalentin.designPatterns.creational.builder.teamMates.ProjectManager;

public class GamePM extends Employ implements ProjectManager {
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
