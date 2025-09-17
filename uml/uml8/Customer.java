package uml8;
import java.util.List;
import java.util.ArrayList;

class Customer {
    private int id;
    private String name;
    private String email;
    private List<Order> orders;

    void setCustomerInfo(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
    }
    void addOrder(Order order) {
        orders.add(order);
    }

    void removeOrder(Order order) {
        orders.remove(order);
    }

    void displayCustomerInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("------------------------");
        for (Order o : orders) {
            o.displayOrder();
            System.out.println("------------------------");
        }
    }
}
