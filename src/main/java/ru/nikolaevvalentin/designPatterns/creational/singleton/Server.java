package ru.nikolaevvalentin.designPatterns.creational.singleton;

public class Server {

    private volatile static Server instance;
    private int mainPort = 9026;

    private Server() {}

    public static Server getInstance() {
        Server serverInstance = instance;
        if (serverInstance == null) {
            synchronized (Server.class) {
                serverInstance = instance;
                if (serverInstance == null) {
                    instance = new Server();
                }
            }
        }
        return instance;
    }

    public void setMainPort(int mainPort) {
        this.mainPort = mainPort;
    }

    public int getMainPort() {
        return mainPort;
    }
}
