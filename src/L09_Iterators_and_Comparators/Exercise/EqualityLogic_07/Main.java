import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<Person> treeSet = new TreeSet<>();
        Set<Person> hashSet = new HashSet<>();


        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            treeSet.add(person);
            hashSet.add(person);

        }

        System.out.println(treeSet.size());
        System.out.println(hashSet.size());
    }
}
