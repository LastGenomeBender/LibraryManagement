package service;



import enums.FilePath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {
    public static void readFromFile() throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath.FILE_PATH.getFilePath()))){
            Scanner scanner = new Scanner(bufferedReader);
            while (scanner.hasNextLine()) {

            }
        }
    }
}
