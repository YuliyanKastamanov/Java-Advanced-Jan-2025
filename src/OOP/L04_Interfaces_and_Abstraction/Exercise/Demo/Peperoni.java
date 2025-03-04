package OOP.L04_Interfaces_and_Abstraction.Exercise.Demo;

public class Peperoni extends Pizza{


    public Peperoni(String name, double price) {
        super(name, price);
    }

    public String getIngredients(){

        return String.format("Pizza %s: Tomato, Peperoni, Mozzarella", super.getName());
    }
}
