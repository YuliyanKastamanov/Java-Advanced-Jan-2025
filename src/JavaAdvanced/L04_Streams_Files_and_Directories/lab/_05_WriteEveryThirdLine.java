package JavaAdvanced.L04_Streams_Files_and_Directories.lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _05_WriteEveryThirdLine {

    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\input.txt";
        String outputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\05.WriteEveryThirdLineOutput.txt";

        try (
        //        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath))
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of(inputPath));
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(outputPath))
        ) {
            String line = bufferedReader.readLine();
            int count = 0;
            while (line != null) {
                count++;

                if (count % 3 == 0) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
