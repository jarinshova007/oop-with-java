public class CurrentAccount extends BankAccount {
    public double overdraftLimit;

    CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: " + amount + ", " + "New Balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + ", " + "New Balance: " + getBalance());
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}