
package JAva.Interface;
// Bank.java
// Class Bank

// Import required libraries for List and ArrayList
import java.util.ArrayList;
import java.util.List;

// Declare the Bank class
class Bank {
    // Declare a private list to store accounts
    private List accounts;

    // Constructor for initializing the list of accounts
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the list of accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to remove an account from the list of accounts
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Method to deposit a specified amount into an account
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    // Method to withdraw a specified amount from an account
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    // Method to print the balances of all accounts in the bank
    public void printAccountBalances() {
        for (Object account : accounts) {
            System.out.println("Account balance: " + account.getClass());
        }
    }
}
