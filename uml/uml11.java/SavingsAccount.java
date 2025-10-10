public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount + amount * interestRate / 100);
        System.out.println("Deposited with " + interestRate + "% interest, " + "New balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + ", New Balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void applyLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for Savings Account " + getAccountNumber());
    }
} 
