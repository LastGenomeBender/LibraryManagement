package service;

import enums.Library;
import model.Book;

import java.util.Objects;

public class DeleteBookFromLibrary {
    public static void deleteBook(){
        String id = null;
        try {
            id = ScanBookID.scanBookID();
        }
        catch(Exception e){
            System.out.println("Oops, an error had occurred during the scanning process\n" + e.getMessage() + "\nLet's Try again");
            return;
        }
        while (Objects.nonNull(id)){
            try {
                Library.LIBRARY.getLibrary().remove(Integer.parseInt(id));
            }catch (Exception e){
                System.out.println("The object with this id does not exist\n" + e.getMessage() + "\nLet's Try again");
                return;
            }
        }

        for(Book book : Library.LIBRARY.getLibrary()){
            book.setId(String.valueOf(Library.LIBRARY.getLibrary().indexOf(book)));
        }

        try {
            WriteToFile.writeToFile();
        }catch (Exception e){
            throw new RuntimeException("Cannot write to file");
        }

    }
}
