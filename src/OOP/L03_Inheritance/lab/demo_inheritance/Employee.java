package demo_inheritance;

public class Employee extends Person {

    private Company company;

    public Employee(String name, String address, Company company) {
        super(name, address);
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "company=" + company.getName() +
               '}';
    }
}
