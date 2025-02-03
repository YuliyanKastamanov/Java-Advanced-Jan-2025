package L08_Generics.Exercise.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>>{

    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T value){
        this.elements.add(value);
    }

    public void swap(int index1, int index2){

        T firstValue = elements.get(index1);
        T secondValue = elements.get(index2);

        this.elements.set(index1, secondValue);
        this.elements.set(index2, firstValue);
    }

    public int countGreaterElements(T elementToCompare){
        int count = 0;

        for (T element : this.elements){

            //Сравняваме дали стойността от списъка е по-голяма от стойността с която сравняваме
            //първото > второто 1 или повече
            int result = element.compareTo(elementToCompare);
            if(result > 0){
                count++;
            }
        }
        return count;

    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (T element: this.elements){
            String stringToAppend = String.format("%s: %s", element.getClass().getName(), element);
            builder.append(stringToAppend).append(System.lineSeparator());

        }

        return builder.toString();
    }
}
