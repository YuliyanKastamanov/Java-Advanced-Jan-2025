package JavaAdvanced.L04_Streams_Files_and_Directories.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {

        String path = "L04_Streams_Files_and_Directories/Exercise/resources/input.txt";

        String contentWithUpperCase = Files.readString(Path.of(path));

        contentWithUpperCase = contentWithUpperCase.toUpperCase();

        BufferedWriter writer = new BufferedWriter(new FileWriter("L04_Streams_Files_and_Directories/Exercise/resources/output.txt"));
        writer.write(contentWithUpperCase);
        writer.close();








    }
}
