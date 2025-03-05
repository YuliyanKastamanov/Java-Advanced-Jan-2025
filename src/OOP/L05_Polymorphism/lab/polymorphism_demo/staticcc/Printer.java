package polymorphism_demo.staticcc;

public class Printer {

    // Method to print one string
    public static void print(String message) {
        System.out.println(message);
    }

    // Method to print two strings
    public static void print(String message1, String message2) {
        System.out.println(message1 + " " + message2);
    }

    // Method to print an integer
    public static void print(int number){
        System.out.println(number);
    }

    // Method to print a double
    public static void print(double decimal){
        System.out.println(decimal);
    }
}
