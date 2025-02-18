package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming_11 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Map<String, Integer> materials = new TreeMap<>();
        materials.put("motes", 0);
        materials.put("shards", 0);
        materials.put("fragments", 0);
        Map<String, Integer> junk = new TreeMap<>();
        boolean finded = false;
        while (!finded) {

            String[] line = console.nextLine().split("\\s+");

            for (int i = 0; i < line.length; i += 2) {
                int quantity = Integer.parseInt(line[i]);
                String material = line[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    materials.put(material, materials.get(material) + quantity);
                    if (materials.get(material) >= 250) {
                        materials.put(material, materials.get(material) - 250);
                        switch (material) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        finded = true;
                        break;
                    }
                } else {
                    junk.putIfAbsent(material, 0);
                    junk.put(material, junk.get(material) + quantity);
                }

            }


        }

        materials.entrySet().stream().sorted((e1, e2) -> {
            return Integer.compare(e2.getValue(), e1.getValue());
        }).forEach(e -> {
            System.out.printf("%s: %d%n", e.getKey(), e.getValue());
        });
        for (Map.Entry<String, Integer> junks : junk.entrySet()) {
            System.out.printf("%s: %d%n", junks.getKey(), junks.getValue());
        }
    }
}
