package L06_Defining_Classes.lab._03_defining_classes;

public class BankAccount {

    // static variables
    private static double interestRate = 0.02;
    private static int counter = 0;

    // instance variables
    private int id;
    private double balance;

    public BankAccount() {
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
