package OOP.L01_WorkingWithAbstraction.Exercise.trafficLights_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lights[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(light -> Lights.valueOf(light))
                .toArray(Lights[]::new);

        int numberOfChanges = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfChanges ; i++) {

            //change the color of lights
            changeLights(lights);
            //print the lights
            printCurrentLights(lights);

        }


    }

    private static void changeLights(Lights[] lights) {



        //Foreach -> Lights light -> копие на елемента от масива
       /* for (Lights light : lights){
            switch (light){
                case RED -> light = Lights.GREEN;
                case GREEN -> light = Lights.YELLOW;
                case YELLOW -> light = Lights.RED;
            }
        }*/

        //red -> green
        //green -> yellow
        // yellow -> red

        for (int i = 0; i < lights.length; i++) {
            switch (lights[i]) {
                case RED:
                    lights[i] = Lights.GREEN;
                    break;
                case GREEN:
                    lights[i] = Lights.YELLOW;
                    break;
                case YELLOW:
                    lights[i] = Lights.RED;
                    break;
            }
        }

    }

    private static void printCurrentLights(Lights[] lights) {

        for (Lights light : lights){
            System.out.printf("%s ", light);
        }
        System.out.println();
    }
}
