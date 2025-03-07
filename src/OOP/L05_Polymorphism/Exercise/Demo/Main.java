package OOP.L05_Polymorphism.Exercise.Demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat lion = new Lion();
        Cat tiger = new Tiger();
        Cat jaguar = new Jaguar();

        lion.run();
        tiger.run();
        jaguar.run();

        Dollitle drDolittle = new Dollitle();
        drDolittle.healCat(lion);
        drDolittle.healCat(tiger);
        drDolittle.healCat(jaguar);

        //Method overriding -> Runtime polymorphism
        // -> Възможността дъщерните класове да дават имплементация на методи, които са дефинирани в бащините класове
        //Method overloading -> Compile-Time polymorphism


    }

    public static void multiply(int a, int b){
        System.out.println(a * b);
    }

    public static void multiply(double a, double b){
        System.out.println(a * b);
    }

    public static void multiply(int a, int b, int c){
        System.out.println(a * b * c);
    }
}
