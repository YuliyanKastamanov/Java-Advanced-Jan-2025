package OOP.L09_Debugging_Techniques.restaurant.models.client;



import OOP.L09_Debugging_Techniques.restaurant.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClientImpl implements Client{



    private String name;
    private List<String> clientOrders;

    public ClientImpl(String name) {
        this.name = name;
        this.clientOrders = new ArrayList<>();
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.CLIENT_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setClientOrders(List<String> clientOrders) {
        this.clientOrders = clientOrders;
    }

    @Override
    public Collection<String> getClientOrders() {
        return clientOrders;
    }

    @Override
    public String getName() {
        return name;
    }
}
