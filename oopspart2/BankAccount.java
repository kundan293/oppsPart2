// BankAccount.java

// Define an abstract class named BankAccount
abstract class BankAccount {
    // Declare private variables for account number and balance
    private String accountNumber;
    private double balance;

    // Constructor that accepts account number and balance, and sets them to the corresponding variables
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Protected setter method for balance
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Declare an abstract method for depositing an amount
    public abstract void deposit(double amount);

    // Declare an abstract method for withdrawing an amount
    public abstract void withdraw(double amount);
}
