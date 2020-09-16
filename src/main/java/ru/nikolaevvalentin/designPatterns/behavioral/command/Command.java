package ru.nikolaevvalentin.designPatterns.behavioral.command;

public abstract class Command {

    private DataBase dataBase;
    private String dataBaseBackUp;

    public Command() {
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public final void makeBackUp() {
        this.dataBaseBackUp = dataBase.getBackUp();
    }

    public final void undo() {
        dataBase.restore(dataBaseBackUp);
    }

    protected DataBase getDataBase() {
        return dataBase;
    }

    public abstract void execute();
}
