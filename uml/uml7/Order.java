package uml7;
import java.util.List;
import java.util.ArrayList;

class Order {
    private int orderId;
    private String date;
    private List<Product> products;
    private List<Payment> payments;
    double total = 0.00;

    void setOrder(int orderId, String date) {
        this.orderId = orderId;
        this.date = date;
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void addPayment(Payment payment) {
        payments.add(payment);
    }

    void removeProduct(Product product) {
        products.remove(product);
    }

    void removePayment(Payment payment) {
        payments.remove(payment);
    }

    void displayOrder() {
        System.out.println("Order Details:");
        System.out.println();
        System.out.println("Order Id: " + orderId);
        System.out.println("Order Date: " + date);
        System.out.println();
        System.out.println("Products:");
        System.out.println();
            for (Product p : products) {
                p.displayProduct();
                System.out.println("------------------------");
                total += p.getPrice();
            }
            System.out.println("Payment Details:");
            System.out.println();
            for (Payment pay : payments) {
                pay.displayPayment();
                System.out.println("Total Amount: " +  total + " tk");
                System.out.println("------------------------");
            }
        }
    }
