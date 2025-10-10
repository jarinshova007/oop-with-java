package uml8;
import java.util.List;
import java.util.ArrayList;

public class Customer extends User{
    private List<Cart> cart;

    Customer(int userId, String name, String email) {
        super(userId, name, email);
        this.cart = new ArrayList<>();
    }

    // add cart
    public void addCart(Cart c) {
        cart.add(c);
    }

    // display Customer
    public void displayCustomer() {
        super.login();
        System.out.println("--- Customer Details ---");
        System.out.println("Customer Id: " + getUserId());
        System.out.println("Name : " + getUserName());
        System.out.println("Email: " + getEmail());
        System.out.println("-----------------");
        System.out.println("--- cart ---");
        for (Cart c : cart) {
            c.displayCart();
        }
        super.logout();
        System.out.println("-----------------");
        System.out.println("-----------------");
    }
}