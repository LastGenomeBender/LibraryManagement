package model;

import java.util.Objects;

public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private boolean availability;

    public Book(String id, String title, String author, String genre, boolean availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return id + ";" + title + ";" + author + ";" + genre +  ";" + availability + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book))
            return false;
        Book book = (Book) o;
        return Objects.equals(book.id, id);

    }



    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setId(String id){
        this.id = id;
    }
}
