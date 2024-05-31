package Command;

import java.util.LinkedList;

public class CommandManager {

    private final LinkedList<Command> commands = new LinkedList<Command>();

    public void register (Command command) {

        commands.push(command);
    }

    public void execute () {

        commands.getLast().execute();
    }

    public void remove () {

        commands.removeLast();
    }
}

