package OOP.L07_Reflection_and_Annotations.Exercise.BarracksWarsReturnDependencies_05.models.units;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(Gunner.GUNNER_HEALTH, Gunner.GUNNER_DAMAGE);
    }
}
