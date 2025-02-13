package service;
import enums.Library;
import model.Book;
import java.util.Objects;
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
      if(Objects.nonNull(newBook))
                 Library.LIBRARY.getLibrary().add(newBook);
      try {
          WriteToFile.writeToFile();
      }catch (Exception e){
          throw new RuntimeException("Cannot write to file");
      }

  }
}
