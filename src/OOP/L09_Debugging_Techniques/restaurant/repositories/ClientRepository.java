package OOP.L09_Debugging_Techniques.restaurant.repositories;



import OOP.L09_Debugging_Techniques.restaurant.models.client.Client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ClientRepository implements Repository<Client>{

    private List<Client> clients;

    public ClientRepository() {
        this.clients = new ArrayList<>();
    }

    @Override
    public Collection<Client> getCollection() {
        return clients;
    }

    @Override
    public void add(Client client) {

        this.clients.add(client);

    }

    @Override
    public boolean remove(Client client) {
        return this.clients.remove(client);
    }

    @Override
    public Client byName(String name) {
        return clients.stream().filter(client -> client.getName().equals(name)).findFirst().orElse(null);
    }
}
