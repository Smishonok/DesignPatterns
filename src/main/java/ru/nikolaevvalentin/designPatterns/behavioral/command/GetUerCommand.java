package ru.nikolaevvalentin.designPatterns.behavioral.command;

import java.util.function.Consumer;

public class GetUerCommand extends Command {
    private Consumer<User> callBack;
    private long userId;

    public GetUerCommand(long userId, Consumer<User> callBack) {
        this.userId = userId;
        this.callBack = callBack;
    }

    @Override
    public void execute() {
        callBack.accept(getDataBase().get(userId));
    }
}
