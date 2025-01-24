package L06_Defining_Classes.lab.demo;

import java.util.Collections;

public class DemoStaticMembers {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();

        System.out.println(Counter.count);

        System.out.println(Calculator.add(2, 2));
        System.out.println(Calculator.multiply(5, 5));

        System.out.println(Calculator.SomeClass.someVariable);
    }
}
