package Animal;

public class Cat extends Animal{
    private static final String SOUND = "Meow meow";
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}
