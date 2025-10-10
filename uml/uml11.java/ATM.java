import java.util.List;
import java.util.ArrayList;
public class ATM {
    private List<BankAccount> accounts;

    ATM() {
        accounts = new ArrayList<>();
    }

    // add accounts
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // deposite to a specific account
    public void depositToAccount(int accountNumber, double amount) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                acc.deposit(amount);
                return;
            } else {
                System.out.println("Account not found");
            }
        }
    }

    // withdraw from a specific account
    public void withdrawFromAccount(int accountNumber, double amount) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                acc.deposit(amount);
                return;
            } else {
                System.out.println("Account is not found");
            }
        }
    }

    // apply loan (only for loanable accounts)
    public void applyForLoan(int accountNumber, double amount) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                if (acc instanceof Loanable) {
                    ((Loanable)acc).applyLoan(amount);
                } else {
                    System.out.println("This account cannot apply for a loan");
                }
                return;
            } else {
                System.out.println("Account not found");
            }
        }
    }

    // show all accounts
    public void showAllAccounts() {
        System.out.println("---All Accounts---");
        for (BankAccount acc : accounts) {
            System.out.println("Account Number: " + acc.getAccountNumber() + ", Balance: " + acc.getBalance());
        }
    }
}
