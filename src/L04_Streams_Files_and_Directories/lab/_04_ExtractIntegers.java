package L04_Streams_Files_and_Directories.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class _04_ExtractIntegers {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\input.txt";
        InputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        String outputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\04.ExtractIntegersOutput.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();

                printWriter.flush();
                printWriter.write(String.valueOf(nextInt));

                printWriter.flush();
                printWriter.write(System.lineSeparator());
            }
            scanner.next();
        }

    }
}
