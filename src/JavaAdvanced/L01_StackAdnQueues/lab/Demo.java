package JavaAdvanced.L01_StackAdnQueues.lab;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stack - LIFO - Last in First out
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        // 1 2 3 4 5
        // push(element) - insert element on the top of the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        System.out.println(stack.size());
//        System.out.println(stack.contains(4));
//        stack.forEach(System.out::println);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        // peek() - get topmost element
        //Integer element = stack.peek();

        // pop() - remove topmost element
        //Integer removeTopmostElement = stack.pop();

        // Queue - FIFO - First in First out
        // offer(element) - add element at the end of the Queue
        // poll() - remove first element of the Queue
        // peek() - get first element of the Queue

       Deque<Integer> queue = new ArrayDeque<Integer>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        Integer[] toArray = new Integer[10];
        queue.toArray(toArray);

//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }

        // PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        priorityQueue.offer(15);
        priorityQueue.offer(8);
        priorityQueue.offer(-9);
        priorityQueue.offer(49);
        priorityQueue.offer(30);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        System.out.println();
    }
}








