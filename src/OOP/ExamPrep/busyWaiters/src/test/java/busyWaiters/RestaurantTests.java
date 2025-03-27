package busyWaiters;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RestaurantTests {

    private Restaurant restaurant;
    private FullTimeWaiter waiter;
    private FullTimeWaiter pesho;

    @BeforeEach
    public void setUp(){
        restaurant = new Restaurant("Viktoria", 20);
        waiter = new FullTimeWaiter("Yuli", 5);
        pesho =  new FullTimeWaiter("Pesho", 20);
    }




    @Test
    public void whenCreateWaiterWithValidData_thenWaiterCreatedSuccessfully(){

        String waiterName = "Yuli";
        int efficiency = 5;

        Assertions.assertEquals(waiterName, waiter.getName());
        Assertions.assertEquals(efficiency, waiter.getEfficiency());

    }

    @Test
    public void whenCreateRestaurantWithNameNull_thenExceptionIsThrown(){

        Assertions.assertThrows(NullPointerException.class, () -> new Restaurant(null, 10));

    }

    @Test
    public void whenCreateRestaurantWithCapacityLessThanZero_thenExceptionIsThrown(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Restaurant("Shtastlivetsa", -10));

    }

    @Test
    public void whenAddWaiterInAlreadyFullCapacity_thenExceptionIsThrown(){

        Restaurant yuliRestaurant = new Restaurant("Yuli's", 1);
        yuliRestaurant.addFullTimeWaiter(waiter);
        Assertions.assertThrows(IllegalArgumentException.class, () -> yuliRestaurant.addFullTimeWaiter(pesho));
    }

    @Test
    public void whenAddAlreadyExistingWaiter_thenExceptionIsThrown(){


        restaurant.addFullTimeWaiter(waiter);

        FullTimeWaiter yuli = new FullTimeWaiter("Yuli", 10);

        Assertions.assertThrows(IllegalArgumentException.class, () -> restaurant.addFullTimeWaiter(yuli));
    }

   @Test
    public void whenRemoveWaiter_thenTheWaiterSuccessfullyRemoved(){

        restaurant.addFullTimeWaiter(waiter);

        restaurant.addFullTimeWaiter(pesho);

        Assertions.assertTrue(restaurant.removeFullTimeWaiter("Yuli"));


   }


   @Test
    public void whenGetCount_thenReceiveTheCountOfWaiters(){
        restaurant.addFullTimeWaiter(waiter);

       restaurant.addFullTimeWaiter(pesho);

       Assertions.assertEquals(2, restaurant.getCount());
   }

   @Test
    public void whenGetWaiters_thenReceiveListOfWaiters(){

       List<FullTimeWaiter> myWaiterList = new ArrayList<>();
       myWaiterList.add(waiter);
       myWaiterList.add(pesho);

       restaurant.addFullTimeWaiter(waiter);
       restaurant.addFullTimeWaiter(pesho);

       Assertions.assertEquals(myWaiterList, restaurant.getWaiters());

   }

   @Test
    public void whenGetRestaurantName_thenReceiveWaiterName(){

        String expectedName = "Viktoria";

        Assertions.assertEquals(expectedName, restaurant.getName());
   }



}
