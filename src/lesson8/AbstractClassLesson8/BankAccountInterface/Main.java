package lesson8.AbstractClassLesson8.BankAccountInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount(1000.0, 0.05);
        Scanner scanner = new Scanner(System.in);

        // Deposit entered by user
        System.err.println("Insert Total of Deposit :");
        double d = scanner.nextDouble();
        savingsAccount.deposit(d);

        scanner.close();

        // Print the balance of the savings account
        System.out.println("\nSavings Account Balance: $" + savingsAccount.getBalance());
        savingsAccount.withdraw(200.0);

        // Print the balance of the savings account
        System.out.println("\nSavings Account Balance: $" + savingsAccount.getBalance());

        // Apply interest to the savings account
        savingsAccount.applyInterest();

        // Print the balance of the savings account after applying interest
        System.out.println("Savings Account Balance after Interest: $" + savingsAccount.getBalance());

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount(2000.0, 500.0);

        // Deposit $300 into the checking account
        checkingAccount.deposit(300.0);

        // Withdraw $250 from the checking account
        checkingAccount.withdraw(250.0);

        // Print the balance of the checking account
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }

}
