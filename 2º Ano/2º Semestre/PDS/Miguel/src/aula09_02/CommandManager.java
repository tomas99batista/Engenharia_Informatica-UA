package aula09_02;

import com.sun.istack.internal.NotNull;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CommandManager<T> {
    private Deque<Command> undoCommands;
    private List<Command>  commands;
    private List<T>        list;

    public CommandManager(@NotNull List<T> list) {
        undoCommands = new ArrayDeque<>();
        commands = new ArrayList<>();
        this.list = list;
    }

    public void addCommand(Command c) {
        commands.add(c);
    }

    public void executeCommand(Command c) {
        c.execute();
        undoCommands.add(c);
    }

    public void executeAll() {
        for (Command c :
                commands) {
            undoCommands.add(c);
            c.execute();
        }
        commands = new ArrayList<>();
    }
     public void executeAllAndPrint() {
        System.out.println("Before Execution\n" + list);
        for (Command c :
                commands) {
            undoCommands.add(c);
            c.execute();
            System.out.println(list);
        }
        commands = new ArrayList<>();
    }

    public void undoCommand() {
        if (undoCommands.size() > 0) {
            undoCommands.removeLast().undo();
        }
    }
    public void undoCommandAndPrint() {
        undoCommand();
        System.out.println(list);
    }
}
