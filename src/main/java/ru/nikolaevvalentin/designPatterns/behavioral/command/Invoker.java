package ru.nikolaevvalentin.designPatterns.behavioral.command;


import java.util.LinkedList;
import java.util.Queue;

public class Invoker {
    private DataBase dataBase;
    private CommandHistory commandHistory;
    private Queue<Command> commands = new LinkedList<>();

    public Invoker(DataBase dataBase, CommandHistory commandHistory) {
        this.dataBase       = dataBase;
        this.commandHistory = commandHistory;
    }

    public void invoke(Command command) {
        command.setDataBase(dataBase);
        command.makeBackUp();
        commandHistory.add(command);
        command.execute();
    }

    public void undoLastCommand() {
        if (! commandHistory.isEmpty()) {
            commandHistory.getLastCommand().undo();
        }
    }

    public Invoker addCommandToExecution(Command command) {
        commands.add(command);
        return this;
    }

    public void executeAllCommands() {
        commands.forEach(this::invoke);
    }
}
