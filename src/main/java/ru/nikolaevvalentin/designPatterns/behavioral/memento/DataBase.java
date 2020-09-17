package ru.nikolaevvalentin.designPatterns.behavioral.memento;

import ru.nikolaevvalentin.designPatterns.behavioral.memento.User;

public interface DataBase {

    void add(User user);

    void remove(User user);

    User get(long id);

    void change(User user);

    void restore(Memento backUp);

    Memento makeBackUp();

    void undo();
}
