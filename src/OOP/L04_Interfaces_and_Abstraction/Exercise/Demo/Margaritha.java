package OOP.L04_Interfaces_and_Abstraction.Exercise.Demo;

public class Margaritha extends Pizza{


    public Margaritha(String name, double price) {
        super(name, price);
    }

    public String getIngredients(){

        return String.format("Pizza %s: Tomato, Mozzarella", super.getName());
    }
}
