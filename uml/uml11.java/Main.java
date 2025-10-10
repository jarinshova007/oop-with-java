import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // savings accounts
        SavingsAccount s1 = new SavingsAccount(1001, 950000.0, 6);
        SavingsAccount s2 = new SavingsAccount(1002, 550000.0, 5);

        // current accounts
        CurrentAccount c1 = new CurrentAccount(101, 50000.00, 2000.00);
        CurrentAccount c2 = new CurrentAccount(102, 40000.00, 2000.00);

        // ATM
        ATM atm = new ATM();
        // add accounts
        atm.addAccount(s1);
        atm.addAccount(s2);
        atm.addAccount(c1);
        atm.addAccount(c2);

        while (true) {
            System.out.println("--- ATM MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply For Loan (Only Savings Accounts)");
            System.out.println("4. Show All Accounts");
            System.out.println("5. Exit");
            System.out.print("choice = ");
            int choice = sc.nextInt();

            if (choice == 5) {
            System.out.println("Thank you for using the ATM");
            break;
            }

            System.out.print("Account Number: ");
            int accountNumber = sc.nextInt();
            
            double amount = 0.0;
            if (choice == 1 || choice == 2 || choice == 3) {
                System.out.print("Amount: ");
                amount = sc.nextInt();
            }

            switch (choice) {
                case 1:
                    atm.depositToAccount(accountNumber, amount);
                    break;
                
                case 2:
                    atm.withdrawFromAccount(accountNumber, amount);
                    break;

                case 3:
                    atm.applyForLoan(accountNumber, amount);
                    break;

                case 4:
                    atm.showAllAccounts();
                    break;
                
                default:
                    System.out.println("Invalid Choice! Try again.");
                    break;
            }
        }
    }
}