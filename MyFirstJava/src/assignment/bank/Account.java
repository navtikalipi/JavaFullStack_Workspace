package assignment.bank;

public class Account {

    private double balance;
    private static final double MIN_BALANCE = 500;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws LowBalanceException {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        if (balance - amount < MIN_BALANCE) {
            throw new LowBalanceException(
                    "Withdrawal denied. Minimum balance of 500 must be maintained."
            );
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
