package tr.com.hamzaeren.designpatterns.behavioral.command;

public class ChangeChannelCommand implements Command {
    private final Television tv;
    private final int channelNumber;

    public ChangeChannelCommand(Television tv, int channelNumber) {
        this.tv = tv;
        this.channelNumber = channelNumber;
    }

    @Override
    public void execute() {
        tv.setChannel(channelNumber);
    }
}
