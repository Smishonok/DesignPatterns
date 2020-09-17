package ru.nikolaevvalentin.designPatterns.behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {
        DataBase dataBase = new ConcreteDataBase();

        dataBase.add(new User("Anjey", "Sapcovscy"));
        dataBase.add(new User("Emanuel", "Ramos"));
        dataBase.add(new User("Victorya","Soreira"));

        System.out.println(dataBase.get(2));
        User user = dataBase.get(2);
        dataBase.remove(user);
        System.out.println(dataBase.get(2));
        dataBase.undo();
        System.out.println(dataBase.get(2));
    }
}
