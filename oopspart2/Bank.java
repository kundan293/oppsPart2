
public class Bank {
    public static void main(String[] args) {

        double ibal, damt, wamt;

        ibal = 1000.00;

        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
        System.out.println("Savings A/c: Initial Balace: $" + ibal);
        damt = 500.00;

        savingsAccount.deposit(damt);

        wamt = 250.00;

        savingsAccount.withdraw(wamt);

        wamt = 1600.00;
        // Print attempt to withdraw larger amount
        System.out.println("\nTry to withdraw: $" + wamt);
        // Attempt to withdraw larger amount from SavingsAccount
        savingsAccount.withdraw(wamt);

        // Print an empty line for separation
        System.out.println();

        // Set initial balance for CurrentAccount
        ibal = 5000.00;

        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);

        System.out.println("Current A/c: Initial Balace: $" + ibal);

        // Set deposit amount for CurrentAccount
        damt = 2500.00;

        currentAccount.deposit(1000.0);

        wamt = 1250.00;

        currentAccount.withdraw(3000.0);

        wamt = 6000.00;

        System.out.println("\nTry to withdraw: $" + wamt);

        savingsAccount.withdraw(wamt);
    }
}
