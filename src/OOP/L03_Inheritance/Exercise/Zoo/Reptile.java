package Zoo;

public class Reptile extends Animal{
    public Reptile(String name) {
        //когато създаваме обект от клас, който наследява друг клас
        //java винаги се опитва да извика конструктора на бащиния клас
        super(name);
    }
}
