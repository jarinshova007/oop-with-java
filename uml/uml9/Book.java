package uml9;

public class Book {
    private int bookId;
    private String title;
    private String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }
}
