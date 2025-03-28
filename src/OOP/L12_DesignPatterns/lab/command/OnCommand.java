package command;

public class OnCommand implements Command {

    private SwitchableOn device;

    public OnCommand(SwitchableOn device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
