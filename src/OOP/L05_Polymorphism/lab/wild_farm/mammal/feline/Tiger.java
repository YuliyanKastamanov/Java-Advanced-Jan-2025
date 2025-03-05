package wild_farm.mammal.feline;

import wild_farm.food.Food;
import wild_farm.food.Meat;

public class Tiger extends Feline {

    public Tiger(String animalName,
                 String animalType,
                 Double animalWeight,
                 Integer foodEaten,
                 String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {

        if (food instanceof Meat) {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        } else {
            System.out.printf("%ss are not eating that type of food!\n", this.getAnimalType());
        }
    }
}
