package uml8;

public class Item {
    private int itemId;
    private String itemName;
    private double price;

    Item(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItem() {
        System.out.println("Item Id: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
}
