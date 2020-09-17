package ru.nikolaevvalentin.designPatterns.behavioral.memento;


import java.io.*;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;

public class ConcreteDataBase implements DataBase {

    private Set<User> users = new HashSet<>();
    private CareTaker careTaker = new CareTaker(this);

    @Override
    public void add(User user) {
        careTaker.save();
        users.add(user);
    }

    @Override
    public void remove(User user) {
        careTaker.save();
        users.remove(user);
    }

    @Override
    public User get(long id) {
        return users
                .stream()
                .filter(user->user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void change(User user) {
        careTaker.save();
        User userFromDB = users
                .stream()
                .filter(u->u.getId() == user.getId())
                .findFirst()
                .orElse(null);
        if (userFromDB != null) {
            users.remove(userFromDB);
            users.add(user);
        }
    }

    @Override
    public void undo() {
        if (! careTaker.isEmpty()) {
            careTaker.undo();
        }
    }

    @Override
    public void restore(Memento dataBaseBackUp) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(Base64
                               .getDecoder()
                               .decode(((ConcreteMemento) dataBaseBackUp).getState())))) {
            this.users = (Set<User>) inputStream.readObject();
        } catch (IOException e) {
            throw new IllegalArgumentException("Illegal backUp data, can`t restore object.", e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Can`t restore class.", e);
        }
    }

    @Override
    public Memento makeBackUp() {
        Memento backUp;
        try (ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
             ObjectOutputStream objectStream = new ObjectOutputStream(byteStream)) {
            objectStream.writeObject(this.users);
            backUp = new ConcreteMemento(Base64
                                                 .getEncoder()
                                                 .encodeToString(byteStream.toByteArray()));
        } catch (IOException e) {
            throw new IllegalArgumentException("Can`t create backUp.", e);
        }
        return backUp;
    }

    private class ConcreteMemento implements Memento {
        private String state;

        public ConcreteMemento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}

