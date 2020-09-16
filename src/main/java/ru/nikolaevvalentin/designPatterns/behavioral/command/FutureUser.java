package ru.nikolaevvalentin.designPatterns.behavioral.command;

import java.util.concurrent.*;
import java.util.function.Consumer;

public class FutureUser implements Consumer<User>, Callable<User> {

    private User user;

    @Override
    public void accept(User user) {
        this.user = user;
        try {
            call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User call() throws Exception {
        return user;
    }
}
