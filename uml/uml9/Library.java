package uml9;
import java.util.List;
import java.util.ArrayList;

public class Library {
    String name;
    private List<Member> members;
    private List<Book> books;

    Library(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void registerMember(Member m) {
        members.add(m);
    }

    public void addBook(Book b) {
        books.add(b);
    }
    public void removeBook(Book b) {
        books.remove(b);
    }

    public void displayLibrary() {
        System.out.println("Library Name: " + name);
        System.out.println("-------------------");
        System.out.println("Member Details:");
        for (Member m : members) {
            m.displayMember();
        }
    }
}
