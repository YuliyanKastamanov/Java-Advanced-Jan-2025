package OOP.L02_Encapsulation.Exercise.ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {

        if(!name.trim().isEmpty()) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void setMoney(double money) {

        if(money >= 0) {
            this.money = money;
        }else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public void buyProduct(Product product) {

        if (this.money >= product.getCost()){
            this.products.add(product);
            this.money -= product.getCost();
        }else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }

    }

}