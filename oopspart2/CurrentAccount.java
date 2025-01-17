// CurrentAccount.java
// Subclass CurrentAccount

// Define CurrentAccount class that extends BankAccount
class CurrentAccount extends BankAccount {

    // Constructor to initialize account number and balance
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // Call superclass constructor with account number and balance
    }

    // Override deposit method from BankAccount
    @Override
    public void deposit(double amount) {
        // Add deposit amount to current balance
        setBalance(getBalance() + amount);
        // Print successful deposit message with updated balance
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    // Override withdraw method from BankAccount
    @Override
    public void withdraw(double amount) {
        // Check if there are sufficient funds for the withdrawal
        if (getBalance() >= amount) {
            // Subtract withdrawal amount from current balance
            setBalance(getBalance() - amount);
            // Print successful withdrawal message with updated balance
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            // Print insufficient funds message if withdrawal cannot be made
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
