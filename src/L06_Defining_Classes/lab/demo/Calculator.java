package L06_Defining_Classes.lab.demo;

public class Calculator {

    // Utility class
    private Calculator() {

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static void doSomething() {
        System.out.println(SomeClass.someVariable);
    }

    //inner class
   static class SomeClass {

        static String someVariable = "Something";
    }
}
