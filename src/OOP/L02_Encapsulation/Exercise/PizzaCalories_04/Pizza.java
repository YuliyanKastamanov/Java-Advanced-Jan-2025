package OOP.L02_Encapsulation.Exercise.PizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;//field name changed from dought -> dough
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.name = name;
    }

    //setDough was missing
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
        if(!name.trim().isEmpty() && name.length() <= 15){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    private void setToppings(int toppings){
        if(toppings < 0 || toppings > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(toppings);
    }

    public String getName() {
        return name;
    }

    public void addTopping (Topping topping){
        this.toppings.add(topping);
    }


    public double getOverallCalories (){
        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
