package service;

import enums.Library;
import model.Book;

public class AddBookToLibrary {
  public  static void addBook(){
      Book newBook = null;
      try {
          newBook = ScanBookObject.scanBookName();
      }catch (Exception e){
          System.out.println("Oops an error occured in the Book object creation");
          System.out.println(e.getMessage());
          System.out.println("Let's try again");
          addBook();
          return;
      }
      Library.LIBRARY.getLibrary().add(newBook);
    }
}
