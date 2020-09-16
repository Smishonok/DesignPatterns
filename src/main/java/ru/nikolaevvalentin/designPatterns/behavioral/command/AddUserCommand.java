package ru.nikolaevvalentin.designPatterns.behavioral.command;

public class AddUserCommand extends Command {

    private User user;

    public AddUserCommand() {
    }

    public AddUserCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        getDataBase().add(user);
    }
}
