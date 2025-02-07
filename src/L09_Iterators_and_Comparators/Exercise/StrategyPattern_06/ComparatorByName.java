package L09_Iterators_and_Comparators.Exercise.StrategyPattern_06;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {

        //Вариант 1
        /*Integer firstNameLength = person1.getName().length();
        Integer secondNameLength = person2.getName().length();
        int nameLengthComparingResult = firstNameLength.compareTo(secondNameLength);*/

        //Вариант 2
        int nameLengthComparingResult = Integer.compare(person1.getName().length(), person2.getName().length());

        if(nameLengthComparingResult == 0){
            char firstNameFirstSymbol = person1.getName().toUpperCase().charAt(0); //ivan -> IVAN -> I
            char secondNameFirstSymbol = person2.getName().toUpperCase().charAt(0);//Ivan -> IVAN -> I

            return Character.compare(firstNameFirstSymbol, secondNameFirstSymbol);
        }


        return nameLengthComparingResult;
    }
}
