package L04_Streams_Files_and_Directories.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class _06_SortLines {

    public static void main(String[] args) throws IOException {

        Path inputPath = Paths.get("C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\input.txt");
        Path outputPath = Paths.get("C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\06.SortLinesOutput.txt");

        List<String> allLines = Files.readAllLines(inputPath);
        Collections.sort(allLines);
        Files.write(outputPath, allLines);

    }
}
