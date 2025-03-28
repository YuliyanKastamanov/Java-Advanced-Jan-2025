package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private List<Graphic> graphics;

    public CompositeGraphic() {
        this.graphics = new ArrayList<>();
    }

    public void addGraphic(Graphic graphic) {
        this.graphics.add(graphic);
    }

    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }
}
