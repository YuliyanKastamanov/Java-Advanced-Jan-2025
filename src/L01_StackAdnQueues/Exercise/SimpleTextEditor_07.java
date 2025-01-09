package L01_StackAdnQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();

        ArrayDeque<String> wordState = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {

            String command = scanner.nextLine();
            String commandNumber = command.split("\\s+")[0];

/*•	"1 {string}" - appends [string] to the end of the text.
•	"2 {count}" - erases the last [count] elements from the text.
•	"3 {index}" - returns the element at position [index] from the text.
•	"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.*/

            switch (commandNumber){
                case "1" -> {
                    String textToAdd = command.split("\\s+")[1];
                    wordState.push(text.toString());
                    text.append(textToAdd);
                }
                case "2" -> {
                    wordState.push(text.toString());
                    int count = Integer.parseInt(command.split("\\s+")[1]);
                    int startIndex = text.length() - count;
                    text.delete(startIndex, text.length());

                }
                case "3" ->{
                    int index = Integer.parseInt(command.split("\\s+")[1]) - 1;
                    System.out.println(text.charAt(index));
                }
                case "4" ->  text = new StringBuilder(wordState.pop());

            }


        }








    }
}
