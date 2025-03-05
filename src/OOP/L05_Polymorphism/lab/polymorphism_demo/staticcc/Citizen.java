package polymorphism_demo.staticcc;

public class Citizen extends Person{

    public Citizen() {
    }

    public Citizen(String name) {
        super(name);
    }

    public void info(String someMoreInfo){
        System.out.println("Citizen name is " + super.getName());
    }
}
