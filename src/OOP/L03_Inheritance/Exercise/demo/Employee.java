package OOP.L03_Inheritance.Exercise.demo;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void present(){
        System.out.printf("My name is %s, my salary is %.2f", name, salary);
    }
}
