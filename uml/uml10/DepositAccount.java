package uml10;

public class DepositAccount {
    float balance;
    float amount;

    DepositAccount(float balance, float amount) {
        this.balance = balance;
        this.amount = amount;
    }

    void depositBalance() {
        float total = balance + amount;
        System.out.printf("Successfully deposited (amount): %.2f\n", amount);
        System.out.printf("Current balance: %.2f", total); 
    }
}
