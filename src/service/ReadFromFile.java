package service;

import enums.FilePath;
import enums.Library;
import model.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ReadFromFile {
    public static void readFromFile() throws Exception {
        ArrayList<Book> library = new ArrayList<>();
        Book book = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath.FILE_PATH.getFilePath()))) {
            Scanner scanner = new Scanner(bufferedReader);
            while (scanner.hasNext()) {
                String [] data = scanner.nextLine().trim().split(";");
                book = new Book(data[0], data[1], data[2], data[3], Boolean.parseBoolean(data[4]));
                library.add(book);
            }
        }
         Library.LIBRARY.setLibrary(library);

    }
}
