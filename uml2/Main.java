package uml2;

/*
+----------------+        +----------------+
|    Library     |<>------|     Book       |
+----------------+        +----------------+
| - name:String  |        | - title:String |
| - books:List   |        | - author:String|
+----------------+        +----------------+  */

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Shesher Kabita", "Rabindranath Tagore");
        Book b2 = new Book("Pother Dabi", "Sarat Chandra Chattopadhyay");

        Library lib = new Library("Central Library");
        lib.addBooks(b1);
        lib.addBooks(b2);
        lib.displayLibrary();
    }
}
