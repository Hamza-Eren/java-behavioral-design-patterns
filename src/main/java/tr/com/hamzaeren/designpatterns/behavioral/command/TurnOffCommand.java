package tr.com.hamzaeren.designpatterns.behavioral.command;

public class TurnOffCommand implements Command {
    private final Television tv;

    public TurnOffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
