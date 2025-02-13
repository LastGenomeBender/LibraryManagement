package controller;

import enums.Library;
import model.Book;
import service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            ReadFromFile.readFromFile();
        } catch (Exception e) {
            throw new RuntimeException("Cannot read from file");
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.println("Enter your choice: ");
            String choice = scanner.nextLine();
            if ("1".equals(choice)) {
                AddBookToLibrary.addBook();
            } else if ("2".equals(choice)) {
                RetrieveBook.retrieveBook();
            } else if ("3".equals(choice)) {
                DeleteBookFromLibrary.deleteBook();
            } else if ("4".equals(choice)) {
                ShowAllBooks.showAllBooks();
            } else if ("5".equals(choice)) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to the Library Management System");
        System.out.println("1. Add a book to the library");
        System.out.println("2. Retrieve a book from the library");
        System.out.println("3. Delete a book from the library");
        System.out.println("4. Show all books in the library");
        System.out.println("5. Exit");
    }
}
