package controller;

import service.AddBookToLibrary;
import service.DeleteBookFromLibrary;
import service.RetrieveBook;
import service.ShowAllBooks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                AddBookToLibrary.addBook();
            } else if (choice == 2) {
                RetrieveBook.retrieveBook();
            } else if (choice == 3) {
                DeleteBookFromLibrary.deleteBook();
            } else if (choice == 4) {
                ShowAllBooks.showAllBooks();
            } else if (choice == 5) {
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
