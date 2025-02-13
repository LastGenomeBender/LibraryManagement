package service;

import enums.FilePath;
import enums.Library;
import model.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {
    public static void writeToFile() throws Exception {
//        if (Library.LIBRARY.getLibrary().size() == 0) {
//            System.out.println();
//            return;
//        }
        try (BufferedWriter br = new BufferedWriter(new FileWriter(FilePath.FILE_PATH.getFilePath(), false))) {
            for (Book book : Library.LIBRARY.getLibrary()) {
                System.out.println(book);
            }
        }

    }
}
