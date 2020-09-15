package ru.nikolaevvalentin.designPatterns.behavioral.observer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ListenerManager {

    private Map<String, Set<Listener>> listeners = new HashMap<>();

    public void subscribe(String purpose, Listener listener) {
        if (! listeners.containsKey(purpose)) {
            listeners.put(purpose, Collections.newSetFromMap(new ConcurrentHashMap<>()));
        }
        listeners
                .get(purpose)
                .add(listener);
    }

    public void unsubscribe(Listener listener) {
        listeners
                .values()
                .stream()
                .filter(set->set.contains(listener))
                .forEach(set->set.remove(listener));
    }

    public void unsubscribe(String purpose, Listener listener) {
        listeners
                .get(purpose)
                .remove(listener);
    }

    public void notifyListeners(String purpose) {
        listeners
                .get(purpose)
                .forEach(Listener::update);
    }
}
