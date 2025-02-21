package OOP.L01_WorkingWithAbstraction.lab.P1RhombusOfStars;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n = 3
        int n = Integer.parseInt(scanner.nextLine());
        //  *
        // * *
        //* * *
        // * *
        //  *
        StringBuilder stringBuilder = buildRhombusOfStars(n);
        System.out.println(stringBuilder.toString());
    }

    private static StringBuilder buildRhombusOfStars(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 1) {
            sb.append("*");
            return sb;
        }

        // Принтираме горната част на ромба
        for (int row = 1; row <= n; row++) {
            buildRow(row, n, sb);
        }
        // Принитираме долната част на ромба
        for (int row = n - 1; row >= 1; row--) {
            buildRow(row, n, sb);
        }
        return sb;
    }

    private static void buildRow(int row, int n, StringBuilder sb) {
        int whiteSpace = n - row;
        for (int i = 0; i < whiteSpace; i++) {
            sb.append(" ");
        }

        for (int i = 0; i < row; i++) {
            sb.append("* ");
        }
        sb.append(System.lineSeparator());
    }
}
