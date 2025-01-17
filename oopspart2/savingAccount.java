// SavingsAccount.java

// Define a subclass named SavingsAccount that extends BankAccount
class SavingsAccount extends BankAccount {
    // Constructor that accepts account number and balance, and passes them to the superclass constructor
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Override the deposit method to add an amount to the balance
    @Override
    public void deposit(double amount) {
        // Update the balance by adding the deposit amount
        setBalance(getBalance() + amount);
        // Print a message indicating the deposit was successful
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    // Override the withdraw method to subtract an amount from the balance
    @Override
    public void withdraw(double amount) {
        // Check if the balance is sufficient for the withdrawal
        if (getBalance() >= amount) {
            // Update the balance by subtracting the withdrawal amount
            setBalance(getBalance() - amount);
            // Print a message indicating the withdrawal was successful
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            // Print a message indicating insufficient funds
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
