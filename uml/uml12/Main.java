package uml12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Rectangle and 2 for Circle");
        System.out.print("Enter a number(1 for Rectangle and 2 for Circle): ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.print("Enter length and width\nlength = ");
            double length = sc.nextDouble();
            System.out.print("width = ");
            double width = sc.nextDouble();
            
            Rectangle rec = new Rectangle(length, width);
            double area = rec.calculateArea();
            System.out.printf("The area of Rectangle is : %.2f", area);
        } else if (number == 2)  {
            System.out.print("Enter the radius = ");
            double radius = sc.nextDouble();

            Circle cir =  new Circle(radius);
            double area = cir.calculateArea();
            System.out.printf("The area of Circle is : %.2f", area);
        } else {
            System.out.println("Oops! please enter a valid number!");
        }
    }
}
