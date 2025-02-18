package JavaAdvanced.L04_Streams_Files_and_Directories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {

        String path = "L04_Streams_Files_and_Directories/Exercise/resources/input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        allLines.stream()
                .map(String::toCharArray)
                .forEach(arr -> {
                    int sum = 0;
                    for (char symbol : arr){
                        sum += symbol;
                    }
                    System.out.println(sum);
                });








    }
}
