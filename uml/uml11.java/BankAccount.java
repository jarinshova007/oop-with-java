abstract class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // getters
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // setter
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // abstract classes
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
