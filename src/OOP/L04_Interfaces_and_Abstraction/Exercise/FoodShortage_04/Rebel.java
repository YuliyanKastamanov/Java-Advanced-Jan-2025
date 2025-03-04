package OOP.L04_Interfaces_and_Abstraction.Exercise.FoodShortage_04;

public class Rebel implements Buyer, Person{


    private String name;
    private int age;
    private String group;
    private int food = 0;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }


    @Override
    public void buyFood() {
        food = food + 5;

    }

    public String getGroup() {
        return group;
    }

    @Override
    public int getFood() {
        return food;
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
