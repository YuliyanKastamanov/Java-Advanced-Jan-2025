package L04_Streams_Files_and_Directories.Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("L04_Streams_Files_and_Directories/Exercise/resources/input.txt"));

        String line = bufferedReader.readLine();

        int sum = 0;

        while (line != null){

            for (char symbol : line.toCharArray()){

                sum += symbol;
            }


            line = bufferedReader.readLine();

        }

        System.out.println(sum);






    }
}
