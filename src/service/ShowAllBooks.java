package service;

import enums.Library;
import model.Book;

public class ShowAllBooks {
    public static void showAllBooks() {

        try {
            ReadFromFile.readFromFile();
        }catch (Exception e) {
            throw new RuntimeException("Cannot read from file");
        }

        if (Library.LIBRARY.getLibrary().size() == 0) {
            System.out.println("There are no books in the library");
            return;
        }


        for (Book book : Library.LIBRARY.getLibrary()) {
            System.out.println(book);
        }

    }
}
