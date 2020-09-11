package ru.nikolaevvalentin.designPatterns.structural.proxy;

import java.lang.reflect.InvocationTargetException;

public interface BaseDBInterface {

    User getUser(int id);

    void addUser(User user);

    void removeUser(int id);
}
