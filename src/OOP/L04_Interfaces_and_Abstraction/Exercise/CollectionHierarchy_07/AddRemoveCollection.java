package OOP.L04_Interfaces_and_Abstraction.Exercise.CollectionHierarchy_07;

public class AddRemoveCollection extends Collection implements AddRemovable{

    public String remove() {

        String itemToRemove = this.items.get(this.items.size() - 1);

        this.items.remove(itemToRemove);
        return itemToRemove;
    }

    public int add(String item) {
        this.items.add(0, item);
        return 0;
    }
}
