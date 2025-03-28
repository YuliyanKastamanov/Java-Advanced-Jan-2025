package singleton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> capitals = new HashMap<>();

        capitals.put("Sofia", 120000);
        capitals.put("Varna", 90000);

        SingletonDataContainer instance = SingletonDataContainer.getInstance();

        instance.addCapitals(capitals);

        System.out.println(instance.getPopulation("Sofia"));

        SingletonDataContainer instance1 = SingletonDataContainer.getInstance();

        System.out.println(instance1.getPopulation("Varna"));
    }
}


