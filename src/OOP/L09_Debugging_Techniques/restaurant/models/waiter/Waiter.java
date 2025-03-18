package OOP.L09_Debugging_Techniques.restaurant.models.waiter;

import restaurant.models.orders.TakenOrders;

public interface Waiter {
    String getName();

    int getEfficiency();

    boolean canWork();

    TakenOrders takenOrders();


    void work();
}
