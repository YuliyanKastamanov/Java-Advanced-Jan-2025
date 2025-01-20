package L04_Streams_Files_and_Directories.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Path.of("L04_Streams_Files_and_Directories/Exercise/resources/inputLineNumbers.txt"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("L04_Streams_Files_and_Directories/Exercise/resources/output.txt"));
        int count = 1;

        for (String line : lines){

            writer.write(count + ". " + line);
            writer.newLine();
            count++;
        }

        writer.close();

    }
}
