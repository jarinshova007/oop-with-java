package uml4;

/*
+-------------+        +-------------+        +-------------+
|    Bank     |<>------|  Customer   |<>------|   Account   |
+-------------+        +-------------+        +-------------+
| - name:String|       | - name:String|       | - accNo:int |
| - customers  |       | - accounts   |       | - balance:double|
+-------------+        +-------------+        +-------------+

 */
public class Main { 
    public static void main(String[] args) {
        Account a1 = new Account(1, 1000000.00);
        Account a2 = new Account(2, 5000000.00);
        Account a3 = new Account(3, 30000.00);

        Customer c1 = new Customer("Jarin", a1);
        Customer c2 = new Customer("Stranger", a3);

        c1.addAccount(a1);  // c1 has two accounts (a1 and a2)
        c1.addAccount(a2);
        c2.addAccount(a3);

        Bank bank = new Bank("Bangladesh Bank Ltd.");

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        bank.displayBank();
        
    }
}
