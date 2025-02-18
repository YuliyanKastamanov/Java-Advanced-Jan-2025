package JavaAdvanced.L04_Streams_Files_and_Directories.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountCharacterTypes_04 {

    public static void main(String[] args) throws IOException {

        String path = "L04_Streams_Files_and_Directories/Exercise/resources/input.txt";

        String content = Files.readString(Path.of(path));

        content = content.replaceAll("\\s+", "");

        Set<Character> vowels = new HashSet<>();
        //добавяме всички гласни в Set-a -> •	a, e, i, o, u
        Collections.addAll(vowels,'a', 'e', 'i', 'o', 'u');

        Set<Character> punctuation = new HashSet<>();
        //добавяме всички пунктоационни знаци, за които ще проверяваме -> ! , . ?
        Collections.addAll(punctuation,'!', ',', '.', '?');

        int vowelsCount = 0;
        int punctuationCount = 0;
        int othersCount = 0;


        for (char symbol : content.toCharArray()){

            if(vowels.contains(symbol)){
                vowelsCount++;
            }else if(punctuation.contains(symbol)){
                punctuationCount++;
            }else {
                othersCount++;
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("L04_Streams_Files_and_Directories/Exercise/resources/output.txt"));
        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Other symbols: " + othersCount);
        writer.newLine();
        writer.write("Punctuation: " + punctuationCount);

        writer.close();










    }
}
