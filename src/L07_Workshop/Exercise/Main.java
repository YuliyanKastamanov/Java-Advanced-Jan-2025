package L07_Workshop.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       // Element firstElement = new Element(10, null, null);

        LinkedList list = new LinkedList();

        list.addFirst(50);
        list.addLast(40);
        list.addLast(30);
        list.addLast(10);
        list.addLast(60);
        list.addLast(20);
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());

        list.forEach( value -> System.out.println(value * 10));




        //System.out.println(firstElement);


    }
}
