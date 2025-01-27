package L06_Defining_Classes.Exercise.Google_07;

public class Company {
    private String name;
    private String department;
    private double salary;

    public Company(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Company(){
        this.name = "";
        this.department = "";
        this.salary = 0;
    }

    @Override
    public String toString() {
        return this.name.equals("")
                ? "Company:"
                : String.format("Company:%n%s %s %.2f", this.name, this.department, this.salary);
    }
}
