package L04_Streams_Files_and_Directories.lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\input.txt";

        // try with resources
        try (FileInputStream inputStream = new FileInputStream(path)) {
//            Scanner scanner = new Scanner(inputStream);
//
//            while (scanner.hasNextLine()) {
////                System.out.println(scanner.nextLine());
//            }

            //            int oneByte = inputStream.read();
            //
            //            while (oneByte >= 0) {
            //                //                System.out.println(Integer.toBinaryString(oneByte));
            //
            //                oneByte = inputStream.read();
            //            }

//        } catch (IOException exception) {
//            System.out.println("File not found!");
//        }
//
//        FileReader fileReader = new FileReader(path);
//
//        int read = fileReader.read();
//
//        while (read >= 0) {
//            //            System.out.print((char) read);
//
//            read = fileReader.read();
        }



        BufferedReader reader =
        new BufferedReader(new InputStreamReader(System.in));

//        String hello = reader.readLine(); // Hello BufferedReader
//        System.out.println(hello);

        Path path1 = Path.of(path);
        Path path2 = Paths.get(path);

        BufferedReader bufferedReader = Files.newBufferedReader(path2);

        String outputPath = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\Files-and-Streams\\output.txt";

        List<String> allLines = Files.readAllLines(path1);
        Files.write(Paths.get(outputPath), allLines);

    }
}
