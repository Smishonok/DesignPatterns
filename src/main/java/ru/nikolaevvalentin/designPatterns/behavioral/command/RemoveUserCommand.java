package ru.nikolaevvalentin.designPatterns.behavioral.command;

public class RemoveUserCommand extends Command {
    private User user;

    public RemoveUserCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        getDataBase().remove(user);
    }
}
