package ru.nikolaevvalentin.designPatterns.behavioral.memento;

import java.util.Stack;

public class CareTaker {

    private DataBase dataBase;
    private Stack<Memento> mementoHistory = new Stack<>();

    public CareTaker(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void save() {
        mementoHistory.push(dataBase.makeBackUp());
    }

    public void undo() {
        dataBase.restore(mementoHistory.pop());
    }

    public boolean isEmpty() {
        return mementoHistory.isEmpty();
    }
}
