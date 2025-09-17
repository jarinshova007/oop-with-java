package uml4;
import java.util.List;
import java.util.ArrayList;

public class Bank {
    String name;
    List<Customer> customers;

    Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayBank() {
        System.out.println(name);
        System.out.println();
        System.out.println("Customers Details: ");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        for (Customer c : customers) {
            c.displayCustomer();
        }
    }
}
