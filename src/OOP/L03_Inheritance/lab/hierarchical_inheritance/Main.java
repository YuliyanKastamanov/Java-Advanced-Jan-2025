package hierarchical_inheritance;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        //        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        //        cat.eat();
        cat.meow();
        //  cat.someMethod();
        //  TODO Намери решение на проблема с множественото наследяване в JAVA

        List<Animal> animalList = List.of(dog, cat);

        animalList.forEach(animal -> animal.eat());
    }
}

















