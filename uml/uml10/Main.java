package uml10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a digit(1 to check balance, 2 to deposit and 3 to withdraw): ");
        int digit = sc.nextInt();

        if (digit == 1) {
            System.out.print("balance : ");
            float balance = sc.nextFloat();

            // object create and method call
            CurrentAccount c1 = new CurrentAccount(balance);
            c1.checkBalance();
        } else if(digit == 2) {
            System.out.print("balance : ");
            float balance = sc.nextFloat();
            System.out.print("deposit amount : ");
            float amount = sc.nextFloat();

            // object create and method call
            DepositAccount d1 = new DepositAccount(balance, amount);
            d1.depositBalance();
        } else if(digit == 3) {
            System.out.print("balance : ");
            float balance = sc.nextFloat();
            System.out.print("amount you want to withdraw: ");
            float amount = sc.nextFloat();

            // object create and method call
            WithdrawAccount w1 = new WithdrawAccount(balance, amount);
            w1.withdraw();
        }
    }
}
