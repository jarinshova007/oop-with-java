package uml4;

import java.util.List;
import java.util.ArrayList;

class Customer {
    String name;
    List<Account> accounts;

    Customer(String name, Account account) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    Customer() {
        
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        for (Account a : accounts) {
            a.displayAccount();
        }
        System.out.println("-----------------------");
    }
}
