package service;

import enums.Library;
import model.Book;

import java.util.Scanner;

public class ScanBookObject {
    public static Book scanBookName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book Title");
        String bookName = scanner.nextLine().trim();
        System.out.println("Enter the Book Author");
        String author = scanner.nextLine().trim();
        System.out.println("Enter the Book Genre");
        String genre = scanner.nextLine().trim();
        System.out.println("Enter the Book Availability, true or  false");
        boolean avail = Boolean.parseBoolean(scanner.nextLine().trim());


        return new Book(String.valueOf(Library.LIBRARY.getLibrary().size()), bookName, author, genre, avail);
    }
}
