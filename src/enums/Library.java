package enums;

import model.Book;

import java.util.ArrayList;

public enum Library {
    LIBRARY;

    private ArrayList<Book> library;

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }


}
