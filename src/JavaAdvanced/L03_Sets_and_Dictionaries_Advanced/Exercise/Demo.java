package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = new LinkedHashSet<>();

        Map<String, String> phonebook = new LinkedHashMap<>();

        phonebook.put("Yuli", "08888123123");
        phonebook.put("Ivan", "08888123123");
        phonebook.put("Georgi", "08888123123");
        phonebook.put("Stoyan", "08888123123");

        //1. Set<Integer> numbers = new HashSet<>() -> подрежда елементите без да са в определен ред
        //2. Set<Integer> numbers = new TreeSet<>(); -> подрежда елементите в асцендинг/нарастващ ред
        //3. Set<Integer> numbers = new LinkedHashSet<>(); -> подрежда елементите спрямо реда на добавяне

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        // Set -> запазваме само уникални елементи -> Ако искаме да добавим съществуващ елемент, добавянето ще бъде пропуснато
        // Set -> не можем да достъпваме елемтите по техния индекс









    }
}
