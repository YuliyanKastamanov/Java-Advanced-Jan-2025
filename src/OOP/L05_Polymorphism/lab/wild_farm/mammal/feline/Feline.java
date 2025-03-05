package wild_farm.mammal.feline;

import wild_farm.mammal.Mammal;
import wild_farm.food.Food;

public abstract class Feline extends Mammal {

    public Feline(String animalName,
                  String animalType,
                  Double animalWeight,
                  Integer foodEaten,
                  String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }
    //TODO implement toString for the Tiger only
}
