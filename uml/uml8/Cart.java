package uml8;
import java.util.List;
import java.util.ArrayList;

public class Cart {
    private List<Item> items;

    Cart() {
        this.items = new ArrayList<>();
    }

    // add item
    public void addItem(Item i1) {
        items.add(i1);
    }

    // remove item
    public void removeItem(Item i1) {
        items.remove(i1);
    }
    
    // displayChat
    public void displayCart() {
        for (Item i2 : items) {
            i2.displayItem();
        }
    }
}
