package ru.nikolaevvalentin.designPatterns.structural.proxy;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class DBProxy implements BaseDBInterface {

    private BaseDBInterface mainDataBase;
    private Class<? extends BaseDBInterface> dbClass;

    Map<Integer, User> cash = new HashMap<>();
    Map<Integer, User> addedUserCash = new HashMap<>();

    public DBProxy(Class<? extends BaseDBInterface> dbClass) {
        this.dbClass = dbClass;
    }

    private void initiateDataBase() throws ReflectiveOperationException {
        try {
            if (mainDataBase == null) {
                System.out.println("Initialise data base.");
                mainDataBase = dbClass
                        .getDeclaredConstructor()
                        .newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |
                InvocationTargetException | NoSuchMethodException | SecurityException e) {
            throw new ReflectiveOperationException("Data base class can`t be loaded.", e);
        }
    }

    @Override
    public User getUser(int id) throws ReflectiveOperationException {
        User user;
        if (cash.containsKey(id)) {
            System.out.println("Getting user from cash...");
            user = cash.get(id);
        } else {
            System.out.println("Getting user from data base...");
            initiateDataBase();
            user = mainDataBase.getUser(id);
        }
        return user;
    }

    @Override
    public void setUser(User user) throws ReflectiveOperationException {
        addedUserCash.put(user.getId(), user);
        if (addedUserCash.size() > 5) {
            initiateDataBase();
            for (User u : addedUserCash.values()) {
                mainDataBase.setUser(u);
            }
        }
        addedUserCash.clear();
    }

    @Override
    public void removeUser(int id) {
        cash.remove(id);
        mainDataBase.removeUser(id);
    }
}
