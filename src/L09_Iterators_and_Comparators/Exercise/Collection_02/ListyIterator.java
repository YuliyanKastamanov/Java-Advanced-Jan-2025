package IteratorsAndComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<String> {

    private final int DEFAULT_INDEX = 0;
    private List<String> list;
    private int index;

    public ListyIterator() {
        this.list = new ArrayList<>();
        this.index = this.DEFAULT_INDEX;
    }

    public boolean move(){
        this.index++;
        if (this.index < this.list.size()){
            return true;
        }
        this.index--;
        return false;
    }

    public boolean hasNext(){
        return this.index < this.list.size() - 1;
    }

    public String print(){
        if (this.list.size() < 2){
            return "Invalid Operation!";
        }
        return this.list.get(this.index);
    }

    public void transfer(String[] array){
        this.list.addAll(Arrays.asList(array).subList(1, array.length));
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < list.size();
            }

            @Override
            public String next() {
                return list.get(counter++);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        while (iterator().hasNext()){
            iterator().next();
        }
    }
}
