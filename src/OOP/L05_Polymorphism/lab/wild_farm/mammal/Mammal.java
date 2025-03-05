package wild_farm.mammal;

import wild_farm.Animal;
import wild_farm.food.Food;
import wild_farm.food.Vegetable;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalName,
                  String animalType,
                  Double animalWeight,
                  Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {

        if (food instanceof Vegetable) {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        } else {
            String animalType = "Zebras";
            if (this.getClass().getSimpleName().equals("Mouse")) {
                animalType = "Mice";
            }

            System.out.printf("%s are not eating that type of food!\n", animalType);
        }
    }
    //TODO implement toString for Mouse and Zebra
}
