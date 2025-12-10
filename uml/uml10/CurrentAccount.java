package uml10;

public class CurrentAccount {
    private float balance;
    CurrentAccount(float balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.printf("Current balance: %.2f", balance);
    }
}
