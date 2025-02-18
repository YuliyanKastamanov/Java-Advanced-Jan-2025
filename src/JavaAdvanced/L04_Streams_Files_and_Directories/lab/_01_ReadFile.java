package JavaAdvanced.L04_Streams_Files_and_Directories.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class _01_ReadFile {

    public static void main(String[] args) {

        String path = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\input.txt";

        try (InputStream inputStream = new FileInputStream(path)) {

            int oneByte = inputStream.read();

            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");

                oneByte = inputStream.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
