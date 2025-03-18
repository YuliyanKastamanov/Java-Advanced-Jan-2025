package OOP.L09_Debugging_Techniques.restaurant.models.working;

import restaurant.models.client.Client;
import restaurant.models.waiter.Waiter;

import java.util.Collection;

public class WorkingImpl implements Working{
    @Override
    public void takingOrders(Client client, Collection<Waiter> waiters) {

        Collection<String> orders = client.getClientOrders();

        for (Waiter waiter : waiters){

            while (waiter.canWork() && orders.iterator().hasNext()){

                waiter.work();

                String currentOrder = orders.iterator().next();

                waiter.takenOrders().getOrdersList().add(currentOrder);
                orders.remove(currentOrder);
            }

        }





    }
}
