package application.models;

public class Book {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(int id, String title, String author, String isbn, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public boolean isAvailable() { return available; }
}
