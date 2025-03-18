package OOP.L09_Debugging_Techniques.restaurant.models.orders;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TakenOrdersImpl implements TakenOrders{

    private List<String> ordersList;

    public TakenOrdersImpl() {
        this.ordersList = new ArrayList<>();
    }

    @Override
    public Collection<String> getOrdersList() {
        return ordersList;
    }
}
