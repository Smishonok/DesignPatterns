package ru.nikolaevvalentin.designPatterns.structural.proxy;

public class proxyMain {
    public static void main(String[] args) throws ReflectiveOperationException {
        DBProxyInterface dataBaseProxy = new DBProxy(DataBase.class);

        User user1 = new User("Valentin");
        User user2 = new User("Sergey");
        User user3 = new User("Antony");
        User user4 = new User("Samanta");
        User user5 = new User("Arduino");

        dataBaseProxy.addUser(user1);
        dataBaseProxy.addUser(user2);
        dataBaseProxy.addUser(user3);
        dataBaseProxy.addUser(user4);

        System.out.println("Request user from DB...");
        System.out.println("User with id - 3: " + dataBaseProxy.getUser(3).getName());

        dataBaseProxy.addUser(user5);
        dataBaseProxy.cleanCash();

        System.out.println("Request user from DB...");
        System.out.println("User with id - 2: " + dataBaseProxy.getUser(2).getName());
        System.out.println("Request user from DB...");
        System.out.println("User with id - 2: " + dataBaseProxy.getUser(2).getName());

    }



}
