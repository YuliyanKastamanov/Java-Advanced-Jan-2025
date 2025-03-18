package OOP.L09_Debugging_Techniques.restaurant.repositories;

import restaurant.models.waiter.Waiter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WaiterRepository implements Repository<Waiter>{

    private List<Waiter> waiters;

    public WaiterRepository() {
        this.waiters = new ArrayList<>();
    }

    @Override
    public Collection<Waiter> getCollection() {
        return waiters;
    }

    @Override
    public void add(Waiter waiter) {
        this.waiters.add(waiter);
    }

    @Override
    public boolean remove(Waiter waiter) {
        return this.waiters.remove(waiter);
    }

    @Override
    public Waiter byName(String name) {
        return waiters.stream().filter(waiter -> waiter.getName().equals(name)).findFirst().orElse(null);
    }
}
