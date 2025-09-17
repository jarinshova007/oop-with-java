package uml2;
import java.util.List;
import java.util.ArrayList;

public class Library {
    String name;
    List<Book> books;
    
    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBooks(Book book) {
        books.add(book);
    }
    public void displayLibrary() {
        System.out.println("Library Name: " + name);
        System.out.println("Books in this library:");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        for (Book b : books) {
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("----------------------------");
        }
    }
}
