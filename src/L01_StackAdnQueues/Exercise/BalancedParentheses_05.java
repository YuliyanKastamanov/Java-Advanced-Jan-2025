package L01_StackAdnQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> stackOpenBrackets = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {

            char currentSymbol = input.charAt(i);

            if (currentSymbol == '(' || currentSymbol == '[' || currentSymbol == '{'){

                stackOpenBrackets.push(currentSymbol);
            }else {

                if(stackOpenBrackets.isEmpty() || !matchBrackets(stackOpenBrackets.pop(), currentSymbol) ){
                    System.out.println("NO");
                    return;
                }

            }
            
        }

        if(stackOpenBrackets.isEmpty()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }

    private static boolean matchBrackets(char openBracket, char closedBracket) {

        if(openBracket == '('){
            return closedBracket == ')';
        } else if ( openBracket == '[') {
            return  closedBracket == ']';
        }else {
            return closedBracket == '}';
        }


    }
}
