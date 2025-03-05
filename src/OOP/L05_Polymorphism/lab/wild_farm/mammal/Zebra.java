package wild_farm.mammal;

public class Zebra extends Mammal {

    public Zebra(String animalName,
                 String animalType,
                 Double animalWeight,
                 Integer foodEaten,
                 String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
