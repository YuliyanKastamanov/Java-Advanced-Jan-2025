package OOP.L04_Interfaces_and_Abstraction.Exercise.CollectionHierarchy_07;

public class AddCollection extends Collection implements Addable{

    public int add(String item) {

        this.items.add(item);
        return this.items.size() - 1;
    }
}
