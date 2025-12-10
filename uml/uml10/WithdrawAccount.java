package uml10;

public class WithdrawAccount {
    float balance;
    float amount;

    WithdrawAccount(float balance, float amount) {
        this.balance = balance;
        this.amount = amount;
    }

    public void withdraw() {

        // bank gives a loan of 1000.00 tk once at a time
        if (amount <= (balance + 1000.00)) {
            System.out.printf("You've withdrawn (amount): %.2f\n", amount);
            float rest = (balance - amount);
            System.out.printf("Current balance is: %.2f", rest);
        } else {
            System.out.println("you don't have sufficient balance! Kindly recharge your account!");
        }
    }
}
