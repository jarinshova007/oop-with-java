package uml9;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library("Bogura Central Library");

        Member m1 = new Member(01, "Jarin");
        Member m2 = new Member(02, "Shova");
        lib.registerMember(m1);
        lib.registerMember(m2);

        Book b1 = new Book(1, "Shesher Kabita", "Rabindranath");
        Book b2 = new Book(2, "Pother Dabi", "Sharat Chandra");
        lib.addBook(b1);
        lib.addBook(b2);
    }
}
