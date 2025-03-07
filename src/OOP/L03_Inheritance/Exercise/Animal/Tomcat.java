package OOP.L03_Inheritance.Exercise.Animal;

public class Tomcat extends Cat{

    private static final String GENDER = "Male";
    private static final String SOUND = "MEOW";


    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return SOUND;
    }
}
