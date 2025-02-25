package stack_of_strings;

public class Main {

    public static void main(String[] args) {


        StackOfStrings stackOfStrings = new StackOfStrings();

        stackOfStrings.push("Kaloyan");
        stackOfStrings.push("Martin");
        stackOfStrings.push("Ivan");

        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());
    }
}

































