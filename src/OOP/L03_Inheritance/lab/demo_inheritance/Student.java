package demo_inheritance;

public class Student extends Person {

    private String school;


    protected Student(String name, String address, String school) {
        super(name, address);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}
