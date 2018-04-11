package com.albenyuan.pattern.command;

import java.util.Vector;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 09:13
 */
public class Invoker {

    private Vector<Command> commands = new Vector<>();


    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void action() {
        for (Command command : getCommands()) {
            command.execute();
        }
    }

    public Iterable<Command> getCommands() {
        return (Iterable<Command>) commands.clone();
    }

}
