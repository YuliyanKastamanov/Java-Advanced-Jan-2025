package JavaAdvanced.L04_Streams_Files_and_Directories.lab;

import java.io.File;

public class _07_ListFiles {

    public static void main(String[] args) {

    File folder = new File("C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\resources\\Files-and-Streams");

        File[] files = folder.listFiles();

        for (File file : files) {
            if (!file.isDirectory()){
                System.out.printf("%s: [%d]\n", file.getName(), file.length());
            }
        }

    }
}
