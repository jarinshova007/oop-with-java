package uml8;

public class Product {
    private int prodId;
    private String name;
    private double price;

    double getPrice() {
        return price;
    }

    void setProduct(int prodId, String name, double price) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product Id: " + prodId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price + " tk.");
    }
}
