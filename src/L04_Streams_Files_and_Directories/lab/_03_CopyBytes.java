package L04_Streams_Files_and_Directories.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _03_CopyBytes {

    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\input.txt";
        String outputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\03.CopyBytesOutput.txt";


        try (
        InputStream inputStream = new FileInputStream(inputPath);
        OutputStream outputStream = new FileOutputStream(outputPath)
        ) {

            int oneByte = inputStream.read();

            while (oneByte >= 0) {

                if (oneByte == 32 || oneByte == 10) {
                    outputStream.write(oneByte);
                } else {
                    // 79 - O
                    String asciiCode = String.valueOf(oneByte);
                    for (int i = 0; i < asciiCode.length(); i++) {
                        outputStream.write(asciiCode.charAt(i));
                    }
                }

                oneByte = inputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
