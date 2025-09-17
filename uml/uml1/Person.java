package uml1;

public class Person {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this. name = name;
        this.age = age;
        this.address = address;
    }
    
    public void displayPerson() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        address.displayAddress();
    }
}
