package L07_Workshop.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class LinkedList {

    //характеристики на Свързания списък
    private Element head;
    private Element tail;
    private int size;

    //добавяме елемент най-отпред в нашия свързън списък
    public void addFirst(int elementValue){

        //нямаме елементи в нашия свързън списък
        if(this.isEmpty()){
            //добавяме 1-вия елемент в свързания списък
            /*Element firstElement = new Element(elementValue, null, null);
            this.head = firstElement;
            this.tail = firstElement;*/
            addIfEmpty(elementValue);

        }else {
            //добавяме елемента най-отпред
            Element newElement = new Element(elementValue, null, this.head);
            //this.head.setPrev(newElement);
            this.head.prev = newElement;
            this.head = newElement;

        }

        this.size++;

    }

    public void addLast (int elementValue){

        //нямаме елементи в нашия свързън списък
        if(this.isEmpty()){
            addIfEmpty(elementValue);
        }else {
            Element newElement = new Element(elementValue, this.tail, null);
            this.tail.next = newElement;
            this.tail = newElement;
        }

        this.size++;

    }

    public int get(int index){
        //разписваме метод, който връща true or false в зависимост от индекса
        if(isOutOfBounds(index)){
            throw new IndexOutOfBoundsException("Provided index is invalid!");
        }

        Element currentElement = this.head;
        for (int position = 1; position <= index; position++) {
            currentElement = currentElement.next;

        }
        return currentElement.value;

    }

    public int removeFirst(){
        if(this.isEmpty()){
            throw new NoSuchElementException("The Collection is empty!");
        }

        int result = this.head.value;
        if(this.size == 1){
            this.head = null;
            this.tail = null;
        }else {
            this.head = this.head.next;
            this.head.prev = null;
        }

        this.size--;

        return result;
    }

    public int removeLast(){

        if(this.isEmpty()){
            throw new NoSuchElementException("The Collection is empty!");
        }
        int result = this.tail.value;

        if(this.size == 1){
            this.head = null;
            this.tail = null;
        }else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }

        this.size--;
        return result;


    }

    public void forEach(Consumer<Integer> consumer){

        Element currentElement = this.head;
        while (currentElement != null){
            consumer.accept(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public int[] toArray(){
        List<Integer> numbers = new ArrayList<>();
        this.forEach(value -> numbers.add(value));

        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }





    private boolean isOutOfBounds(int index){
        return index < 0 || index >= this.size;
    }

    private void addIfEmpty(int elementValue) {
        Element firstElement = new Element(elementValue, null, null);
        this.head = firstElement;
        this.tail = firstElement;

    }

    private boolean isEmpty() {

        return this.size == 0;
    }


}
