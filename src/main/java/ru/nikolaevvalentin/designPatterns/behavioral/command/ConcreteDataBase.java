package ru.nikolaevvalentin.designPatterns.behavioral.command;

import java.io.*;
import java.util.*;

public class ConcreteDataBase implements DataBase {

    private Set<User> users = new HashSet<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void remove(User user) {
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
    public void restore(String dataBaseBackUp) {
        Base64.Decoder decoder = Base64.getDecoder();
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new ByteArrayInputStream(decoder.decode(dataBaseBackUp)))) {
            this.users = (Set<User>) inputStream.readObject();
        } catch (IOException e) {
            throw new IllegalArgumentException("Illegal backUp data, can`t restore object.", e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Can`t restore class.", e);
        }
    }

    @Override
    public String getBackUp() {
        String backUp="";
        try (ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
                ObjectOutputStream objectStream = new ObjectOutputStream(byteStream)) {
            objectStream.writeObject(this.users);
            backUp = Base64
                    .getEncoder()
                    .encodeToString(byteStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalArgumentException("Can`t create backUp.", e);
        }
        return backUp;
    }
}
