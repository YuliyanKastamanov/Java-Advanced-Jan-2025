package OOP.L03_Inheritance.Exercise.Person;

//всеки sub-class(дъщерен клас) трябва да удовлетворява конструктора на бащиния клас
public class Child extends Person{


    public Child(String name, int age) {
        super(name, age);
    }
}
