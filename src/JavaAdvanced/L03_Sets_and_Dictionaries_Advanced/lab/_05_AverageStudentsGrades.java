package JavaAdvanced.L03_Sets_and_Dictionaries_Advanced.lab;

import java.util.*;

public class _05_AverageStudentsGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String studentName = tokens[0];
            double grade = Double.parseDouble(tokens[1]);

            students.putIfAbsent(studentName, new ArrayList<>());
            List<Double> grades = students.get(studentName);
            grades.add(grade);
        }

        // Alex -> 2.00 3.00 (avg: 2.50)
        //Maria -> 5.50 2.50 3.46 (avg: 3.82)
        //Stephan -> 5.20 3.20 (avg: 4.20)

        students.forEach((k, v) -> {
            System.out.print(k + " -> ");
            v.forEach(grade -> System.out.printf("%.2f ", grade));
            System.out.printf("(avg: %.2f)\n", getAvgGrade(v));
        });
    }

    private static double getAvgGrade(List<Double> grades) {

                double sum = 0;

                for (Double grade : grades) {
                    sum += grade;
                }

                return sum  / grades.size();

//        DoubleSummaryStatistics stats = grades.stream()
//                                              .collect(Collectors.summarizingDouble(Double::doubleValue));
//
//        return stats.getAverage();
    }
}
