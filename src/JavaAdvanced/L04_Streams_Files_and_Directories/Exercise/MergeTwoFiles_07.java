package JavaAdvanced.L04_Streams_Files_and_Directories.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {

        List<String> linesOne = Files.readAllLines(Path.of("L04_Streams_Files_and_Directories/Exercise/resources/inputOne.txt"));
        List<String> linesTwo = Files.readAllLines(Path.of("L04_Streams_Files_and_Directories/Exercise/resources/inputTwo.txt"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("L04_Streams_Files_and_Directories/Exercise/resources/output.txt"));

        linesOne.forEach(line -> {

            try {
                writer.write(line);
                writer.newLine();
            }catch (IOException exception){
                exception.printStackTrace();
            }

        });

        linesTwo.forEach(line -> {
            try {
                writer.write(line);
                writer.newLine();
            }catch (IOException exception){
                exception.printStackTrace();
            }
        });

        writer.close();




    }
}
