package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.models.units;

public class Horseman extends AbstractUnit {
    private static final int HORSEMAN_HEALTH = 50;
    private static final int HORSEMAN_DAMAGE = 10;

    public Horseman() {
        super(Horseman.HORSEMAN_HEALTH, Horseman.HORSEMAN_DAMAGE);
    }
}
