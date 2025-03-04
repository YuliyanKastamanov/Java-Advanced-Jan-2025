package OOP.L04_Interfaces_and_Abstraction.Exercise.CollectionHierarchy_07;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {

    private final int maxSize = 100;
    protected List<String> items;

    public Collection() {
        this.items = new ArrayList<>(maxSize);
    }
}
