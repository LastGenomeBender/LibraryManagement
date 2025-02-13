package service;
import enums.Library;
import model.Book;
import java.util.ListIterator;
import java.util.Objects;

public class RetrieveBook {
    public static void retrieveBook(){
        String name = null;
        try {
            name =ScanBookName.scanBookName();
        }catch (Exception e){
            System.out.println("Oops, an error had occurred during the scanning process\n" + e.getMessage() + "\nLet's Try again");
            retrieveBook();
            return;
        }
        Book match = null;
        ListIterator<Book> iterator = Library.LIBRARY.getLibrary().listIterator();
        while (iterator.hasNext()){
            Book item = iterator.next();
            if(item.getTitle().equals(name))
                   match = item;
        }
        System.out.println(Objects.nonNull(match)?match:"No match found");
    }
}
