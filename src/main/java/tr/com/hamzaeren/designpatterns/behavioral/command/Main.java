package tr.com.hamzaeren.designpatterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl remote = new RemoteControl();

        Command turnOn = new TurnOnCommand(tv);
        remote.setCommand(turnOn);
        remote.pressButton();

        Command changeChannel = new ChangeChannelCommand(tv, 7);
        remote.setCommand(changeChannel);
        remote.pressButton();

        Command volumeUp = new VolumeUpCommand(tv);
        remote.setCommand(volumeUp);
        remote.pressButton();
        remote.pressButton();
    }
}
