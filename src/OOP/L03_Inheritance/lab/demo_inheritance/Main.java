package demo_inheritance;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee
                            ("Kaloyan", "Sofia", new Company("SoftUni"));
        Student student = new Student("Peter", "Sofia", "Mathematics School");
        CollegeStudent collegeStudent = new CollegeStudent("Iv", "Plovdiv", "SoftUni");

        System.out.println(employee.getName());
        System.out.println(employee.getAddress());


        System.out.println(student.getName());
        System.out.println(student.getSchool());

        System.out.println(collegeStudent.getName());
        System.out.println(collegeStudent.getSchool());
    }
}

















