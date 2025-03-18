package OOP.L09_Debugging_Techniques.restaurant.models.waiter;

import restaurant.common.ExceptionMessages;
import restaurant.models.orders.TakenOrders;
import restaurant.models.orders.TakenOrdersImpl;


public abstract class BaseWaiter implements Waiter{

    private String name;
    private int efficiency;

    private TakenOrders takenOrders;

    public BaseWaiter(String name, int efficiency) {
        setName(name);
        setEfficiency(efficiency);
        this.takenOrders = new TakenOrdersImpl();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.WAITER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {

        if(efficiency < 0){
            throw new IllegalArgumentException(ExceptionMessages.WAITER_EFFICIENCY_LESS_THAN_ZERO);
        }
        this.efficiency = efficiency;
    }

    public TakenOrders takenOrders() {
        return takenOrders;
    }

    public void setTakenOrders(TakenOrders takenOrders) {
        this.takenOrders = takenOrders;
    }

    public abstract void work();

    public boolean canWork(){
        return efficiency > 0;
    }
}
