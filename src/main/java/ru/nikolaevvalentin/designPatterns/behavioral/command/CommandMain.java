package ru.nikolaevvalentin.designPatterns.behavioral.command;

public class CommandMain {
    public static void main(String[] args) {
        try {
            DataBase dataBase = new ConcreteDataBase();
            CommandHistory commandHistory = new CommandHistory();
            Invoker invoker = new Invoker(dataBase, commandHistory);

            Command addUser1 = new AddUserCommand(new User("Aleks", "Mokkin"));
            Command addUser2 = new AddUserCommand(new User("Maria", "Borkvina"));
            Command addUser3 = new AddUserCommand(new User("Anjey", "Sapcovscy"));
            Command addUser4 = new AddUserCommand(new User("Mary", "Safron"));

            invoker
                    .addCommandToExecution(addUser1)
                    .addCommandToExecution(addUser2)
                    .addCommandToExecution(addUser3)
                    .addCommandToExecution(addUser4);
            invoker.executeAllCommands();

            Command getUserCommand = new GetUerCommand(3L, System.out::println);
            invoker.invoke(getUserCommand);

            FutureUser futureUser = new FutureUser();
            getUserCommand = new GetUerCommand(3L, futureUser);
            invoker.invoke(getUserCommand);
            User userFromDB = futureUser.call();
            Command removeUser = new RemoveUserCommand(userFromDB);
            invoker.invoke(removeUser);
            invoker.invoke(getUserCommand);
            System.out.println(futureUser.call());
            invoker.undoLastCommand();
            invoker.undoLastCommand();
            invoker.invoke(getUserCommand);
            System.out.println(futureUser.call());



        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
