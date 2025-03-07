package OOP.L03_Inheritance.Exercise.demo;

public class Engineer extends Employee {

    private String authorization;

    public Engineer(String name, double salary, String authorization) {
        super(name, salary);
        this.authorization = authorization;
    }

    public void prepareProject(){
        System.out.println("Project prepared!");
    }

}
