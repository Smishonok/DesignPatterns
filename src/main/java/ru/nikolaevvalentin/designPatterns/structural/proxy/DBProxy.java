package ru.nikolaevvalentin.designPatterns.structural.proxy;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class DBProxy implements DBProxyInterface {

    private BaseDBInterface mainDataBase;
    private Class<? extends BaseDBInterface> dbClass;

    private Map<Integer, User> cash = new HashMap<>();
    private Map<Integer, User> addedUserCash = new HashMap<>();

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
            cash.put(user.getId(), user);
        }
        return user;
    }

    @Override
    public void addUser(User user) throws ReflectiveOperationException {
        System.out.println("Adding user to cash...");
        addedUserCash.put(user.getId(), user);
        cash.put(user.getId(), user);
        if (addedUserCash.size() >= 5) {
            System.out.println("Send data from cash to data base...");
            initiateDataBase();
            for (User u : addedUserCash.values()) {
                mainDataBase.addUser(u);
            }
            System.out.println("Cleaning the cash...");
            addedUserCash.clear();
        }
    }

    @Override
    public void removeUser(int id) {
        cash.remove(id);
        mainDataBase.removeUser(id);
    }

    @Override
    public void cleanCash() {
        cash.clear();
    }
}
