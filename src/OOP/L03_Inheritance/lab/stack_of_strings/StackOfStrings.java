package stack_of_strings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {

    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    // • Public method: push(String item): void
    public void push(String item) {
        this.data.add(item);
    }

    //•	Public method: pop(): String
    public String pop() {
        if (this.data.size() == 0) {
            throw new UnsupportedOperationException("Stack is empty!");
        }
        String element = this.data.get(this.data.size() - 1);
        this.data.remove(element);

        return element;
    }

    //•	Public method: peek(): String
    public String peek() {
        if (this.data.size() == 0) {
            throw new UnsupportedOperationException("Stack is empty!");
        }
        return this.data.get(this.data.size() - 1);
    }

    //•	Public method: isEmpty(): boolean
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
