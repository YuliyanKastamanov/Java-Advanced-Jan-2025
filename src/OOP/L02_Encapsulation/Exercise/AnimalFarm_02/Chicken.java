package OOP.L02_Encapsulation.Exercise.AnimalFarm_02;

public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }


    private void setName(String name) {

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    private void setAge(int age) {
        if(age < 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay (){

        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {

        if(this.age <= 5){
            return 2;
        } else if (this.age <= 11) {
            return 1;
        }else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, productPerDay());
    }
}
