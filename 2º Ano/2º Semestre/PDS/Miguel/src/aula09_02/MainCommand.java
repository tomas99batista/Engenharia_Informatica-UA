package aula09_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainCommand {
    public static void main(String[] args) {
        //simpleMainCommand();
        managerMainCommand();
    }

    public static void simpleMainCommand() {
        Stack<Command> history = new Stack<>();
        List<Integer>  list    = new ArrayList<>();
        System.out.println("Before adding");
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            Command c = new AddCommand<>(list, i * 9);
            c.execute();
            history.push(c);
        }
        System.out.println("After adding");
        System.out.println(list);
        history.pop().undo();
        System.out.println("After undoing");
        System.out.println(list);
    }

    public static void managerMainCommand() {
        List<Integer>           list    = new ArrayList<>();
        CommandManager<Integer> manager = new CommandManager<>(list);

        System.out.println("Before adding");
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            manager.addCommand(new AddCommand<>(list, i * 9));
        }
        System.out.println("Before removing");
        for (int i = 0; i < 10; i++) {
            manager.addCommand(new RemoveCommand<>(list, i * 9));
        }

        manager.executeAllAndPrint();
        System.out.println("Before undo");
        for(int i = 0; i < 5 ; i++){
            manager.undoCommandAndPrint();
        }
    }
}
