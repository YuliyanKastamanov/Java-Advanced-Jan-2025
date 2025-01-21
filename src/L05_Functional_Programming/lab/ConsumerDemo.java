package L05_Functional_Programming.lab;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        // Consumer<InputParam> -> void -> use with accept()
        Consumer<String> printFunc = text -> System.out.println(text);

        printFunc.accept("Hello SoftUni!");
        print("Hello SoftUni! - method");
    }

    private static void print(String text) {
        System.out.println(text);
    }

}
