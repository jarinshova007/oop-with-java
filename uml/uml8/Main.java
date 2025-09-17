package uml8;
/*
+----------------+          +----------------+        +----------------+
|   Customer     |<>--------|    Order       |<>------|   Product      |
+----------------+          +----------------+        +----------------+
| - id:int       |          | - orderId:int  |        | - prodId:int   |
| - name:String  |          | - date:String  |        | - name:String  |
| - email:String |          | - products:List|        | - price:double |
+----------------+          | - total:double |        +----------------+
                            +----------------+
                                |
                                |<>------ +----------------+
                                |         |   Payment      |
                                |         +----------------+
                                |         | - payId:int    |
                                |         | - method:String|
                                |         | - amount:double|
                                +---------+----------------+
 */

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setProduct(01, "Laptop", 250000.00);

        Product p2 = new Product();
        p2.setProduct(02, "LCD Screen Cleaning Kit", 180.00);

        Product p3 = new Product();
        p3.setProduct(03, "Mouse", 400.00);

        Product p4 = new Product();
        p4.setProduct(04, "Keyboard", 2000.00);

        Product p5 = new Product();
        p5.setProduct(05, "Mini Table", 1800.00);

        Order ord1 = new Order();
        ord1.setOrder(1, "17 - 09 - 2025");
        Order ord2 = new Order();
        ord2.setOrder(2, "18 - 09 - 2025");
        Order ord3 = new Order();
        ord3.setOrder(3, "19 - 09 - 2025");

        // add product
        ord1.addProduct(p1);
        ord1.addProduct(p2);
        ord2.addProduct(p3);
        ord2.addProduct(p4);
        ord3.addProduct(p5);
        
        Payment pay1 = new Payment();
        pay1.setPayment(101, "Rocket");
        Payment pay2 = new Payment();
        pay2.setPayment(102, "Nagad");
        Payment pay3 = new Payment();
        pay3.setPayment(103, "Cash");

        ord1.addPayment(pay1);
        ord2.addPayment(pay2);
        ord3.addPayment(pay3);
        
        System.out.println("Customer Details:");
        System.out.println();
        Customer c1 = new Customer();
        c1.setCustomerInfo(01, "Jarin", "jarinshova1234@gmail.com");
        c1.addOrder(ord1);
        c1.displayCustomerInfo();
        Customer c2 = new Customer();
        c2.setCustomerInfo(02, "Natasha", "natasha5678@gmail.com");
        c2.addOrder(ord2);
        c2.displayCustomerInfo();
        Customer c3 = new Customer();
        c3.setCustomerInfo(03, "Alexy", "alexy91011@gmail.com");
        c3.addOrder(ord3);
        c3.displayCustomerInfo();
    }
}
