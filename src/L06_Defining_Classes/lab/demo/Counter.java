package L06_Defining_Classes.lab.demo;

public class Counter {

    static int count = 0; // static variable shared among all instances

    public Counter() {
        // increment count each time a new object is created
        count++;
    }
}
