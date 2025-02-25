package hierarchical_inheritance;

public class Dog extends Animal {

    public void bark() {
        System.out.println("barking...");
    }

    @Override
    public void eat() {
        System.out.println("I am a dog and I love eating meat!");
    }
}
