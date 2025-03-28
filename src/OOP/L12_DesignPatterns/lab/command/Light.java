package command;

public class Light implements SwitchableOn, SwitchableOff {

    public void turnOn() {
        System.out.println("Light is ON!");
    }

    public void turnOff() {
        System.out.println("Light is OFF!");
    }
}
