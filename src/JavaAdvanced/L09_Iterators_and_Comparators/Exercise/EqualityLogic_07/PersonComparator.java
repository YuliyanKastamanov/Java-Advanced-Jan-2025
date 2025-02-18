package JavaAdvanced.L09_Iterators_and_Comparators.Exercise.EqualityLogic_07;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getAge() - second.getAge();
    }
}
