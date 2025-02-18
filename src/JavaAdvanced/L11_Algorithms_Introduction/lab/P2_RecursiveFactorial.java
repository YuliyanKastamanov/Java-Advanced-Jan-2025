package JavaAdvanced.L11_Algorithms_Introduction.lab;

import java.util.Scanner;

public class P2_RecursiveFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
  /*
        n! -> факториел от n
        5! -> 5 * 4 * 3 * 2 * 1
        5! -> 5 * 4!
        4! -> 4 * 3!
        3! -> 3 * 2!
        2! -> 2 * 1!

        0! = 1 -  Дъно на рекурсията
  */

        System.out.println(factorial(n));
    }

    private static int factorial(int n){

        if (n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }
}
