import java.util.Scanner;

class Pens {
    String brandName;
    String color;
    float price;

    public void printBrandName() {
        System.out.println("Brand name: " + this.brandName);
    }

    public void printColor() {
        System.out.println("Color: " + this.color);
    }

    public float printPrice(float Price) {
        // System.out.println("Color: " + this.price); // normal way
        System.out.printf("Price: %.2f\n", this.price);  // for 2 digit after decimal point
        return price;
    }
}
public class Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1st object
        Pens matador = new Pens();
        matador.brandName = "Matador";
        matador.color = "Red";
        // taking input:
        System.out.print("matador.price: ");
        matador.price = sc.nextFloat();

        System.out.println(); // for a blank line

        matador.printBrandName();
        matador.printColor();
        matador.printPrice(matador.price);

        System.out.println(); // for a blank line

        // 2nd object
        Pens fresh = new Pens();
        fresh.brandName = "Fresh";
        fresh.color = "White";
        fresh.price = 5.00F;
        fresh.printBrandName();
        fresh.printColor();
        fresh.printPrice(fresh.price);

        sc.close();

    }
}