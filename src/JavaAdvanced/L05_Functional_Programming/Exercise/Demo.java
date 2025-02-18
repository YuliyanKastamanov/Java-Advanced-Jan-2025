package JavaAdvanced.L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Demo {
    public static void main(String[] args) {



        //Императивен/Структуриран подход за програмиране
        List<String> students = Arrays.asList("Yuli", "Stoyan", "Petar", "Yana");
        for (String name : students){
            if(name.startsWith("Y")){
                System.out.println(name);
            }
        }

        //Функционален подход -> използваме lambda expressions
        students.stream()
                .filter(name -> name.startsWith("Y"))//Predicate
                .map(name -> name.toUpperCase())//Function
                .forEach(name -> System.out.println(name));//Consumer




        //Най-често използвани ламбда изрази
        //Predicate -> получава аргумент -> връща булева стойност
        //Consumer -> получава аргумент -> не връща резултат
        //Function -> получава аргумент -> извършваме дадено действие -> връща резултат

        //Supplier -> () -> извършваме дадено действие -> връща резултат
        //BiFunction -> аргумент1, аргумент2 -> извършваме действие с тези 2 аргумента-> връща резултат

        BiFunction<String ,String, String> biFunctionConcatenateNames = (name1, name2) -> name1 + " " + name2;
        System.out.println(biFunctionConcatenateNames.apply("Yuliyan", "Kastamanov"));






    }
}
