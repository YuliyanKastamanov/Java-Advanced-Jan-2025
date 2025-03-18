package OOP.L09_Debugging_Techniques.restaurant.models.working;



import OOP.L09_Debugging_Techniques.restaurant.models.client.Client;
import OOP.L09_Debugging_Techniques.restaurant.models.waiter.Waiter;

import java.util.Collection;

public interface Working {
    void takingOrders(Client client, Collection<Waiter> waiters);

}
