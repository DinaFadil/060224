package lesson8.AbstractClassLesson8.BankAccountInterface;

public class CheckingAccount implements BankAccount {
    private double balance;
    //private double overdraftLimit;

    // Constructor
    public CheckingAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        //this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void deposit(double d) {
        balance += d;
    }

    public void withdraw(double d) {
        if (d <= balance) {
            balance -= d;
        } else {
            System.out.println("Insufficient funds");
        }
    }

}
