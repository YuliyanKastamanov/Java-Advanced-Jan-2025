package command;

public class Demo {

    public static void main(String[] args) {
        Light light = new Light();
        Tv tv = new Tv();
        Command onCommand = new OnCommand(light);
        Command offCommand = new OffCommand(light);

        Invoker onInvoker = new Invoker(onCommand);
        Invoker offInvoker = new Invoker(offCommand);

        onInvoker.executeCommand();
        offInvoker.executeCommand();

        onCommand = new OnCommand(tv);
        offCommand = new OffCommand(tv);

        onInvoker = new Invoker(onCommand);
        offInvoker = new Invoker(offCommand);

        onInvoker.executeCommand();
        offInvoker.executeCommand();
    }
}
