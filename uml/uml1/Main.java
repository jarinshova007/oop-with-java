package uml1;
/*
+----------------+        +----------------+
|    Person      |<>------|    Address     |
+----------------+        +----------------+
| - name:String  |        | - city:String  |
| - age:int      |        | - state:String |
| - address:Addr |        | - zip:String   |
+----------------+        +----------------+ */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();


        Address addr1 = new Address(city, state, zip);
        Person p1 = new Person(name, age, addr1);
        p1.displayPerson();


    }
}
