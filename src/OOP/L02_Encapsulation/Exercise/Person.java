package OOP.L02_Encapsulation.Exercise;

public class Person {

    private String name;

    public void setName(String name) {

        if(name.isEmpty()){
            System.out.println("Provided name is empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
