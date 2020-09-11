package ru.nikolaevvalentin.designPatterns.structural.proxy;

import java.lang.reflect.InvocationTargetException;

public interface BaseDBInterface {

    User getUser(int id) throws ReflectiveOperationException;

    void addUser(User user) throws ReflectiveOperationException;

    void removeUser(int id);
}
