package uml8;
public class Main {
    public static void main(String[] args) {
        // items
        Item item1 = new Item(101, "Laptop", 120000.00);
        Item item2 = new Item(102, "Keyboard", 3000.00);
        Item item3 = new Item(103, "Mouse", 650.00);
        Item item4 = new Item(104, "Television", 45000.00);
        Item item5 = new Item(105, "Mini Table", 2600.00);

        // add item
        Cart cart1 = new Cart();
        cart1.addItem(item1);
        cart1.addItem(item2);
        cart1.addItem(item3);

        Cart cart2 = new Cart();
        cart2.addItem(item4);
        cart2.addItem(item5);

        // remove item
        cart1.removeItem(item3);

        // Customers
        Customer c1 = new Customer(1001, "Jarin", "jarinshova007@gmail.com");
        c1.addCart(cart1);
        c1.displayCustomer();
        
        Customer c2 = new Customer(1002, "Shova", "jarinshova007@gmail.com");
        c2.addCart(cart2);
        c2.displayCustomer();

        // Admin
        Admin a1 = new Admin(33, "Tanisha", "tanisha1234@gmain.com");
        a1.displayAdmin();
    }
}
