package reflections_demo;

import java.util.ArrayList;
import java.util.List;

public class DemoAnnotation {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.stream()
                    .filter(employee ->
                            employee.getClass()
                                    .getAnnotation(Company.class)
                                    .name()
                                    .equals("SoftUni"));

        Employee employee = new Employee("Kaloyan", "Plovdiv");

        Class<? extends Employee> employeeClass = employee.getClass();

        Company company = employeeClass.getAnnotation(Company.class);

        System.out.println(company.name());

    }
}
