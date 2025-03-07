package climbers.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import climbers.models.mountain.Mountain;

public class MountainRepository implements Repository<Mountain> {

    private Collection<Mountain> mountains;

    public MountainRepository() {
        this.mountains = new ArrayList<>();
    }

    @Override
    public Collection<Mountain> getCollection() {
        return Collections.unmodifiableCollection(this.mountains);
    }

    @Override
    public void add(Mountain entity) {
        this.mountains.add(entity);
    }

    @Override
    public boolean remove(Mountain entity) {
        return this.mountains.remove(entity);
    }

    @Override
    public Mountain byName(String name) {
        return this.mountains.stream()
                             .filter(mountain -> mountain.getName().equals(name))
                             .findFirst()
                             .orElse(null);
    }
}
