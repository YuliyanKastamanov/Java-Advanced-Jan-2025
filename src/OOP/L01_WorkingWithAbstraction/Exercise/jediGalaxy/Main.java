package OOP.L01_WorkingWithAbstraction.Exercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //dimensions[0] - rows
        //dimensions[1] - cols
        int[] dimensions = readPositions(scanner.nextLine());

        Galaxy galaxy = new Galaxy(new Filed(dimensions[0],dimensions[1]));


        String command = scanner.nextLine();
        long sumJediPower = 0;

        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPosition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];
            int jediRow = jediPosition[0];
            int jediCol = jediPosition[1];


            galaxy.moveEvil(evilRow, evilCol);

            sumJediPower += galaxy.moveJedi(jediRow, jediCol);

            command = scanner.nextLine();
        }

        System.out.println(sumJediPower);


    }

    private static int[] readPositions(String input) {

        return Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
