package ru.nikolaevvalentin.designPatterns.behavioral.command;

public interface DataBase {

    void add(User user);

    void remove(User user);

    User get(long id);

    void change(User user);

    void restore(String backUp);

    String getBackUp();


}
