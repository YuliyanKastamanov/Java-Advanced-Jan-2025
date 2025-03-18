package OOP.L09_Debugging_Techniques.restaurant.models.waiter;


public class FullTimeWaiter extends BaseWaiter {

    private static final int INITIAL_EFFICIENCY = 8;
    private static final int DECREASE_EFFICIENCY = 1;


    public FullTimeWaiter(String name) {
        super(name, INITIAL_EFFICIENCY);
    }



    @Override
    public void work() {

        this.setEfficiency(this.getEfficiency() - DECREASE_EFFICIENCY);

    }
}
