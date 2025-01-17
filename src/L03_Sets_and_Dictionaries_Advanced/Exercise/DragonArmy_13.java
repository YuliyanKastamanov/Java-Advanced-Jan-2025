package L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DragonArmy_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, List<Dragon>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] tokens = reader.readLine().split(" ");
            String type = tokens[0];
            String name = tokens[1];

//            Instantiate new Dragon
            Dragon dragon = new Dragon(type, name);
            if (!"null".equals(tokens[2])) {
                dragon.setDamage(Integer.parseInt(tokens[2]));
            }
            if (!"null".equals(tokens[3])) {
                dragon.setHealth(Integer.parseInt(tokens[3]));
            }
            if (!"null".equals(tokens[4])) {
                dragon.setArmor(Integer.parseInt(tokens[4]));
            }

            dragons.putIfAbsent(type, new ArrayList<>());

            boolean isExist = false;
            for (Map.Entry<String, List<Dragon>> listDragons : dragons.entrySet()) {
                for (Dragon dragonInList : listDragons.getValue()) {
                    if (dragonInList.getType().equals(type) && dragonInList.getName().equals(name)) {
                        listDragons.getValue().set(listDragons.getValue().indexOf(dragonInList), dragon);
                        isExist = true;
                    }
                }
            }

            if (!isExist) {
                dragons.get(type).add(dragon);
            }

        }


        for (Map.Entry<String, List<Dragon>> dragonList : dragons.entrySet()) {
            double avgDamage = 0.0;
            double avgHealth = 0.0;
            double avgArmor = 0.0;

            for (Dragon dragon : dragonList.getValue()) {
                avgDamage += dragon.getDamage();
                avgHealth += dragon.getHealth();
                avgArmor += dragon.getArmor();
            }

            avgDamage /= dragonList.getValue().size();
            avgHealth /= dragonList.getValue().size();
            avgArmor /= dragonList.getValue().size();

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", dragonList.getKey(), avgDamage, avgHealth, avgArmor);
            dragonList.getValue().stream()
                    .sorted(Comparator.comparing(Dragon::getName))
                    .forEach(e -> {
                        System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                                e.getName(), e.getDamage(), e.getHealth(), e.getArmor());
                    });


        }


    }
}

class Dragon {
    private String type;
    private String name;
    private int damage;
    private int health;
    private int armor;

    public Dragon(String type, String name) {
        this.type = type;
        this.name = name;
        this.damage = 45;
        this.health = 250;
        this.armor = 10;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
