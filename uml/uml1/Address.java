package uml1;

public class Address {
    String city;
    String state;
    String zip;

    Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void displayAddress() {
        System.out.println("city: " + city);
        System.out.println("state: " + state);
        System.out.println("zip: " + zip);
    }
}
