package OOP.L04_Interfaces_and_Abstraction.Exercise.FoodShortage_04;

public class Citizen implements Buyer, Identifiable, Person{


    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food = 0;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }


    @Override
    public void buyFood() {
        this.food = this.food + 10;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public String getId() {
        return id;
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
