package JavaAdvanced.L08_Generics.Exercise.CustomList;//package L08_Generics.Exercise.CustomList;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class CustomList <T extends Comparable<T>>{
//
//    private List<T> list;
//
//    public int size;
//
//    public CustomList() {
//        this.list = new ArrayList<>();
//    }
//    //•	void add(T element)
//    public void add(T element){
//        this.list.add(element);
//        this.size++;
//    }
//    //•	T remove(int index)
//    public T remove(int index){
//
//        if(isNotInRange(index)){
//            return null;
//        }
//        this.size--;
//        return this.list.remove(index);
//
//    }
//
//    //•	boolean contains(T element)
//    public boolean contains(T element){
//       //boolean isContains = false;
//        return this.list.contains(element);
//    }
//    //•	void swap(int index, int index)
//    public void swap(int index1, int index2){
//        if(isNotInRange(index1) || isNotInRange(index2)){
//            System.out.println("First/Second index is/are not valid!");
//        }else {
//            T firstValue = list.get(index1);
//            T secondValue = list.get(index2);
//            this.list.set(index1, secondValue);
//            this.list.set(index2, firstValue);
//        }
//
//
//    }
//    //•	int countGreaterThan(T element)
//
//    public int countGreaterThan(T elementToCompare){
//        int count = 0;
//
//        for (T element : this.list){
//            //Сравняваме дали стойността от списъка е по-голяма от стойността с която сравняваме
//            //първото > второто 1 или повече
//            int result = element.compareTo(elementToCompare);
//            if(result > 0){
//                count++;
//            }
//        }
//        return count;
//
//    }
//    //•	T getMax()
//    public T getMax(){
//
//        T max = this.list.getFirst();
//        for (T currentElement : list){
//            if(currentElement.compareTo(max) > 0){
//                max = currentElement;
//            }
//        }
//
//        return max;
//        //return Collections.max(list);
//    }
//
//    //•	T getMin()
//    public T getMin(){
//
//        T min = this.list.getFirst();
//
//        for (T currentElement : list){
//            if(currentElement.compareTo(min) < 0){
//                min = currentElement;
//            }
//        }
//        return min;
//    }
//
//    public T get(int index){
//        if(isNotInRange(index)){
//            System.out.println("Invalid index!");
//            return null;
//        }
//
//        return this.list.get(index);
//    }
//
//    private boolean isNotInRange(int index) {
//
//        return index < 0 || index >= this.list.size();
//    }
//
//
//    public void sort() {
//
//        this.list.sort(Comparable::compareTo);
//    }
//}
