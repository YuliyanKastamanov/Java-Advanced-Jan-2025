package L06_Defining_Classes.Exercise.Google_07;

public class Parent {
    private String name;
    private String birthDate;

    public Parent(String name, String type) {
        this.name = name;
        this.birthDate = type;
    }

    @Override
    public String toString() {

        return this.name + " " + this.birthDate;
    }
}
