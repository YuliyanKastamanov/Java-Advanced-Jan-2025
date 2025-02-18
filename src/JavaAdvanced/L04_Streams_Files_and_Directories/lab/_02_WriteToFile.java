package JavaAdvanced.L04_Streams_Files_and_Directories.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _02_WriteToFile {

    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\input.txt";
        String outputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\02.WriteToFileOutput.txt";

        try (
        // Read from a file byte by byte
        InputStream inputStream = new FileInputStream(inputPath);
        // Write to a file byte by byte
        OutputStream outputStream = new FileOutputStream(outputPath)
        ) {

            int oneByte = inputStream.read();
            while (oneByte >= 0) {
                char symbol = (char) oneByte;

                // Skip the following symbols: ",", ".", "!", "?".
                if (symbol != ',' && symbol != '.' && symbol != '!' && symbol != '?') {
                    outputStream.write(oneByte);
                }
                oneByte = inputStream.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
