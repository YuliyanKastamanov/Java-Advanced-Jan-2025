package command;

public class Tv implements SwitchableOn, SwitchableOff {

    public void turnOn() {
        System.out.println("Tv is ON!");
    }

    public void turnOff() {
        System.out.println("Tv is OFF!");
    }
}
