package JavaAdvanced.Exam_Examples.cafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        if(this.employees.size() < capacity){
            this.employees.add(employee);
        }
    }

    public boolean removeEmployee(String name){
        boolean isSuccessfullyRemoved = false;

        for (Employee employee : employees){

            if(employee.getName().equals(name)){
                employees.remove(employee);
                isSuccessfullyRemoved = true;
                break;
            }
        }
        return  isSuccessfullyRemoved;
    }

    public Employee getOldestEmployee(){
        Employee oldestEmployee = null;
        int employeeAge = 0;

        for (Employee employee : employees){
            if (employee.getAge() > employeeAge){

                employeeAge = employee.getAge();
                oldestEmployee = employee;

            }
        }

        return oldestEmployee;
    }

    public Employee getEmployee(String name){

        Employee currentEmployee = null;

        for (Employee employee : employees){
            if(employee.getName().equals(name)){
                currentEmployee = employee;
            }
        }

        return currentEmployee;
    }

    public int getCount(){
        return employees.size();
    }

    public String report(){

        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Employees working at Cafe :%n", name));


        for (Employee employee : employees){

            builder.append(employee.toString()).append(System.lineSeparator());
        }


        return builder.toString();

    }


}
