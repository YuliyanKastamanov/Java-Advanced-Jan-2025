package command;

public class OffCommand implements Command {

    SwitchableOff device;

    public OffCommand(SwitchableOff device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
