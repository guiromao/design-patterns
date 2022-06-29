package co.gromao.designpatterns.core.command;

import java.util.Objects;

public class RemoteControl {

    private Command command;

    public void pressButton() {
        if (Objects.nonNull(command)) {
            command.execute();
        } else {
            throw new RuntimeException("Command must be selected.");
        }
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
