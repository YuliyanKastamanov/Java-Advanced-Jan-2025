package hierarchical_inheritance;

public class Cat extends Animal{

    private Cage cage;

    public Cat() {
        this.cage = new Cage();
    }

    @Override
    public void eat() {
        System.out.println("I am a cat and I eat only whiskas!");
    }

    public void meow() {
        System.out.println("meowing...");
        cage.someMethod();
    }

}
