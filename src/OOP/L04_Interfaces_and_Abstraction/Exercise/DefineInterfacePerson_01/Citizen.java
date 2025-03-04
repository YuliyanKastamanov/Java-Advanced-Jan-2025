package OOP.L04_Interfaces_and_Abstraction.Exercise.DefineInterfacePerson_01;

public class Citizen implements Person{

    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
