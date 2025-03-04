package OOP.L04_Interfaces_and_Abstraction.Exercise.Demo;

public abstract class Pizza {

    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void bake(){
        System.out.printf("Pizza %s is baked", name);
    }

    public void deliver(){
        System.out.printf("Pizza %s is ready to be delivered. The price is: %.2f");
    }

    public abstract String getIngredients();
}
