package uml11;

import java.util.Scanner;

public class UML {
    public void displayInfo(int number) {
        Number n = new Number();
        n.number = number;

        if (n.isEven()) {
            System.out.println("even");
        } else {
            System.out.println("not even");
        }
        if (n.isPrime()) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        if (n.isGoldBach()) {
            System.out.println("goldBach");
        } else {
            System.out.println("not GoldBach");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("number: ");
            int num = sc.nextInt();
            UML uml = new UML();
            uml.displayInfo(num);
            
            if (num < 0) { // poditive numbers only
                break;
            }
        }
    }
}
