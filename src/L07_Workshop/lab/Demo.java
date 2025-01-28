package L07_Workshop.lab;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo {

    public static void main(String[] args) {


        CustomStack customStack = new CustomStack();

        customStack.push(5);
        customStack.push(4);
        customStack.push(3);
        customStack.push(2);
        customStack.push(1);

        System.out.println(customStack.peek());

        customStack.forEach(System.out::println);

    }
}

















