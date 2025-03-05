package wild_farm.mammal.feline;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalName,
               String animalType,
               Double animalWeight,
               Integer foodEaten,
               String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    //TODO implement toString for the Cat
}
