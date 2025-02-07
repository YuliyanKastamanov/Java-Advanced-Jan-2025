package L09_Iterators_and_Comparators.Exercise.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //1. Varargs

       /* printName("Yuli");

        printName("Yuli", "Georgi");*/

       /* List<String> names = new ArrayList<>();

        names.add("Yuli");
        names.add("Georgi");
        names.add("Peter");
        //printName(names);

        printData("Bulgaria","Yuli", "Georgi", "Peter", "Yana");*/

        //1. Varargs -> аргумента получен в метода го третираме като масив
            // 1.1 -> Varargs винаги трябва да бъде последен аргумент
            // 1.2 -> В един метод можем да имаме 1 Varargs


        Movie movie1 = new Movie("The Substance", 50.00, 7.3);
        Movie movie2 = new Movie("Gladiator", 40.00, 8.5);
        Movie movie3 = new Movie("The Night Agent", 8.00, 7.5);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        Collections.sort(movies);
        movies.forEach(System.out::println);

        Collections.sort(movies, new MovieBudgetComparator());
        movies.forEach(System.out::println);

        //Comparator -> Ни дава възможност да разпишем външна логиза за сравнение на 2 обекта
        //Comparable -> даваме възможност даден обект да бъде сравняван с друг обект от същия клас



    }

    public static void printData(String country, String... names){

        for (String name : names){
            System.out.println(name);
        }


    }

    /*public static void printName(List<String> names){
        names.forEach(System.out::println);
    }*/


    /*public static void printName(String name){
        System.out.println(name);
    }

    public static void printName(String name1, String name2){
        System.out.println(name1);
        System.out.println(name2);
    }*/


}
