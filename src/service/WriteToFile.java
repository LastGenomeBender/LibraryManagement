package service;
import enums.FilePath;
import enums.Library;
import model.Book;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {
    public static void writeToFile() throws Exception {
       try (BufferedWriter br = new BufferedWriter(new FileWriter(FilePath.FILE_PATH.getFilePath()))) {
           for (Book book : Library.LIBRARY.getLibrary()) {
               System.out.println(book.toString());
           }
       }
    }
}
