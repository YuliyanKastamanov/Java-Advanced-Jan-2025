package JavaAdvanced.L04_Streams_Files_and_Directories.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {

        String path = "L04_Streams_Files_and_Directories/Exercise/resources/input.txt";

        //Четене на файлове
        //Прочитаме файл чрез Scanner
        Scanner scanner = new Scanner(new File(path));
        System.out.println(scanner.nextLine());

        //BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        System.out.println(bufferedReader.readLine());


        //FileReader -> Files.readAllLines
        List<String> lines = Files.readAllLines(Path.of(path));
        System.out.println(lines.get(0));

        //File
        String fullContent = Files.readString(Path.of(path));


        //Писане по файлове
        // PrintWriter:
        PrintWriter printWriter = new PrintWriter("L04_Streams_Files_and_Directories/Exercise/resources/output.txt");
        printWriter.println("Hello World!");

        printWriter.close();



        //BufferedWriter
        BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter("L04_Streams_Files_and_Directories/Exercise/resources/output.txt"));

        bufferedWriter.write("Hello World!");
        bufferedWriter.close();

        //FileWriter
        FileWriter fileWriter = new FileWriter("L04_Streams_Files_and_Directories/Exercise/resources/output.txt");
        fileWriter.write("Hello World");

        fileWriter.close();



    }
}
