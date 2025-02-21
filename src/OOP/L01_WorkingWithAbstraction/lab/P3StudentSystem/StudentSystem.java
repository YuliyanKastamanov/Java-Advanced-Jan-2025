package OOP.L01_WorkingWithAbstraction.lab.P3StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {

    private Map<String, Student> studentRepository;

    public StudentSystem() {
        this.studentRepository = new HashMap<>();
    }

    public Map<String, Student> getStudentRepository() {
        return this.studentRepository;
    }

    public void parseCommand(String[] args) {

        String command = args[0];
        String name = args[1];

        if (command.equals("Create")) {
            var age = Integer.parseInt(args[2]);
            var grade = Double.parseDouble(args[3]);

            studentRepository.putIfAbsent(name, new Student(name, age, grade));

        } else if (command.equals("Show")) {

            if (studentRepository.containsKey(name)) {
                Student student = studentRepository.get(name);
                System.out.println(student);
            }
        }
    }

}
