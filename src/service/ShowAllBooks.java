package service;

import enums.Library;
import model.Book;

public class ShowAllBooks {
    public static void showAllBooks() {

        for (Book book : Library.LIBRARY.getLibrary()) {
            System.out.println(book.toString());
        }

    }
}
