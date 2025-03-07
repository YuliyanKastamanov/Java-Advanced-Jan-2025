package dependency_inversion;

public class Button {

    private SwitchableDevice switchableDevice;
    private boolean onCondition;

    public Button(SwitchableDevice switchableDevice) {
        this.switchableDevice = switchableDevice;
        this.onCondition = true;
    }

    public void poll() {
        if (onCondition) {
            switchableDevice.turnOn();
            System.out.printf(
            "%s is turned on!\n", this.switchableDevice.getClass().getSimpleName());
            onCondition = false;
        } else {
            switchableDevice.turnOff();
            System.out.printf(
            "%s is turned off!\n", this.switchableDevice.getClass().getSimpleName());
            onCondition = true;
        }
    }

    public void switchh(SwitchableDevice device) {
        if (onCondition) {
            device.turnOn();
            System.out.printf(
            "%s is turned on!\n", device.getClass().getSimpleName());
            onCondition = false;
        } else {
            device.turnOff();
            System.out.printf(
            "%s is turned off!\n", device.getClass().getSimpleName());
            onCondition = true;
        }
    }
}
