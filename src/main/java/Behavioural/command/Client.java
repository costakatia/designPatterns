package Behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Client{
    private Invoker invoker;

    private List<Command> commandList;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();

    }
    public void run(){
        Receiver receiver = new Light("Flash light");
        Command command = new TurnOnCommand(receiver);
        commandList = new ArrayList<>();
        commandList.add(command);

        invoker = new Invoker(command);
        invoker.executeCommand();


        Receiver receiver1 = new Motor("Motor");
        Command command1 = new TurnOnCommand(receiver1);
        commandList.add(command1);

        invoker.setCommand(command1);
        invoker.executeCommand();

        commandList.forEach(commandBackup ->{
            invoker.setCommand(commandBackup);
            invoker.undoComnnand();
        });



    }
}
