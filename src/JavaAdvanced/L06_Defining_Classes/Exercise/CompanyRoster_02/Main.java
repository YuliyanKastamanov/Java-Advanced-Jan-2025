package JavaAdvanced.L06_Defining_Classes.Exercise.CompanyRoster_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEmployees = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> employeeMap = new HashMap<>();


        for (int i = 1; i <= countEmployees; i++) {
            String[] employeeData = scanner.nextLine().split("\\s+");
            //name, salary, position, department, email, and age.
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String department = employeeData[3];
            Employee currentEmployee = null;
            if (employeeData.length == 6) {
                String email = employeeData[4];
                int age = Integer.parseInt(employeeData[5]);
                currentEmployee = new Employee(name, salary, position, department, email, age);
                System.out.println();

            } else if (employeeData.length == 4) {
                currentEmployee = new Employee(name, salary, position, department);

            } else {
                String element5 = employeeData[4];
                if (element5.contains("@")) {
                    String email = element5;
                    currentEmployee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(element5);
                    currentEmployee = new Employee(name, salary, position, department, age);
                }
            }

            if (!employeeMap.containsKey(department)) {
                //прочетеният отдел не съществува в нашия Map
                //отдел -> празен отдел/списък със служители
                List<Employee> currentEmployeesList = new ArrayList<>();
                currentEmployeesList.add(currentEmployee);
                employeeMap.put(department, currentEmployeesList);
            } else {
                //прочетеният отдел съществува
                employeeMap.get(department).add(currentEmployee);
            }
        }

        String departmentNameWithHighestAvgSalary = employeeMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue())))
                .get()
                .getKey();

        System.out.printf("Highest Average Salary: %s%n", departmentNameWithHighestAvgSalary);

        List<Employee> employeesWithHighestSalary = employeeMap.get(departmentNameWithHighestAvgSalary);

        employeesWithHighestSalary.sort(Comparator.comparing(Employee::getSalary));
        Collections.reverse(employeesWithHighestSalary);

        for (Employee employee : employeesWithHighestSalary){
            //ако искаме да си конструираме стринга за служител ни трябват getters
            StringBuilder builder = new StringBuilder();
            builder.append(employee.getName() + " ")
                    .append(String.format("%.2f ", employee.getSalary()))
                    .append(employee.getEmail() + " ")
                    .append(employee.getAge());

            System.out.println(builder);
        }


    }

    private static double getAverageSalary(List<Employee> employees) {

        double sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }

        return sum / employees.size();
    }
}
