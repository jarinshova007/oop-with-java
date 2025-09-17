package uml4;

public class Account {
    int AccNo;
    double balance;

    Account(int AccNo, double balance) {
        this.AccNo = AccNo;
        this.balance = balance;
    }
    public void displayAccount() {
        System.out.println("Account No: "+ AccNo);
        System.out.printf("Balance: %.2f", balance);
        System.out.println();
    }
}
