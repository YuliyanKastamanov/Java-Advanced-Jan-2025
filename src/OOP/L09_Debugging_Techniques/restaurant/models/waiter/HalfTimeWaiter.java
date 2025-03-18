package OOP.L09_Debugging_Techniques.restaurant.models.waiter;


public class HalfTimeWaiter extends BaseWaiter  {

    private static final int INITIAL_EFFICIENCY = 4;
    private static final int DECREASE_EFFICIENCY = 2;

    public HalfTimeWaiter(String name) {
        super(name, INITIAL_EFFICIENCY);
    }




    @Override
    public void work() {
        this.setEfficiency(this.getEfficiency() - DECREASE_EFFICIENCY);
    }
}
