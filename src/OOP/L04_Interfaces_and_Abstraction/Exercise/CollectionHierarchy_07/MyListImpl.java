package OOP.L04_Interfaces_and_Abstraction.Exercise.CollectionHierarchy_07;

public class MyListImpl extends Collection implements MyList {

    public String remove() {

        String itemToRemove = this.items.get(0);
        this.items.remove(itemToRemove);
        return itemToRemove;
    }


    public int add(String item) {

        this.items.add(0, item);
        return 0;
    }


    public int getUsed() {
        return this.items.size();
    }
}
