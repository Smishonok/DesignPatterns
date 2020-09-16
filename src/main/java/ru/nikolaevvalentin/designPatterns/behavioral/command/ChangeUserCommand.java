package ru.nikolaevvalentin.designPatterns.behavioral.command;

public class ChangeUserCommand extends Command {
    private User user;

    public ChangeUserCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        getDataBase().change(user);
    }
}
