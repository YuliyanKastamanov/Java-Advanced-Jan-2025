package L03_Sets_and_Dictionaries_Advanced.lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _08_AcademyGraduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //  name    avg score
        Map<String, Double> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .mapToDouble(Double::parseDouble)
                                    .toArray();
            double avgScore = getAvgScore(grades);

            students.put(name, avgScore);
        }

        students.forEach((k, v) -> {
            System.out.printf("%s is graduated with %s\n", k, v);
        });

    }

    private static double getAvgScore(double[] grades) {
        double sum = 0;

        for (Double grade : grades) {
            sum += grade;
        }

        return sum  / grades.length;
    }
}
