package JavaAdvanced.L04_Streams_Files_and_Directories.Exercise;

import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {

        String path = "L04_Streams_Files_and_Directories/Exercise/resources/Exercises Resources";

        File folder = new File(path);

        File[] allFiles = folder.listFiles();

        int folderSize = 0;

        for (File file : allFiles){
            int currentSize = (int) file.length();
            folderSize += currentSize;
        }

        System.out.println("Folder size: " + folderSize);





    }
}
