package JavaAdvanced.L01_StackAdnQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Stack
        //LIFO - last in first out
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //Добавяме елементи
        stack.push(10);
        stack.push(20);
        stack.push(20);

        System.out.println(stack.peek());

        //премахваме елементи
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //Queue -> опашка
        //FIFO - first in first out
        ArrayDeque<String> queue = new ArrayDeque<>();


        queue.offer("Yuli");
        queue.offer("Ivan");
        queue.offer("Stoyan");

        System.out.println(queue.poll());

        System.out.println(queue.peek());



    }
}
