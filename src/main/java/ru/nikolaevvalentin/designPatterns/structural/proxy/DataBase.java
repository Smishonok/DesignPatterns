package ru.nikolaevvalentin.designPatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class DataBase implements BaseDBInterface {

    Map<Integer,User> users = new HashMap<>();

    @Override
    public User getUser(int id) {
        return users.get(id);
    }

    @Override
    public void setUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void removeUser(int id) {
        users.remove(id);
    }
}
