package climbers.models.climber;

public class RockClimber extends BaseClimber {

    private static final double INITIAL_STRENGTH = 120;
    private static final double DECREASE_STRENGTH = 60;

    public RockClimber(String name) {
        super(name, INITIAL_STRENGTH);
    }

    @Override
    public void climb() {
        double strength = super.getStrength() - DECREASE_STRENGTH;

        if (strength < 0) {
            strength = 0;
        }

        super.setStrength(strength);
    }
}
