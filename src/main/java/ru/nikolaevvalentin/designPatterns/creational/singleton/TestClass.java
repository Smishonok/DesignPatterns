package ru.nikolaevvalentin.designPatterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executors = Executors.newFixedThreadPool(5);

        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Server server = Server.getInstance();
                    String threadName = Thread
                            .currentThread()
                            .getName();
                    server.setMainPort(server.getMainPort() + 1);
                    System.out.println(threadName+": " + server.getMainPort());
                }
            }
        }, "Thread 1");
        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Server server = Server.getInstance();
                    String threadName = Thread
                            .currentThread()
                            .getName();
                    server.setMainPort(server.getMainPort() - 1);
                    System.out.println(threadName+": " + server.getMainPort());
                }
            }
        }, "Thread 2");

        executors.execute(firstThread);
        executors.execute(secondThread);
        //        executors.execute(firstThread);
        //        executors.execute(secondThread);

        firstThread.join();
        secondThread.join();

        executors.shutdown();
        System.out.println("Server port changed");

    }
}
