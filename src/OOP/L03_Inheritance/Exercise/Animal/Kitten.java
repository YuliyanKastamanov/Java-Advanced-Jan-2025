package Animal;

public class Kitten extends Cat{

    private static final String GENDER = "Female";
    private static final String SOUND = "Meow";


    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}
