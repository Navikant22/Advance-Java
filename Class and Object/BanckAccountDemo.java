class BankAccount {

    // Fields
    String accountNumber;
    String accountHolder;
    double balance;

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Get balance method
    double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        // Create object
        BankAccount acc = new BankAccount();

        acc.accountNumber = "12345";
        acc.accountHolder = "Navi";

        // Perform operations
        acc.deposit(1000);
        acc.withdraw(300);

        // Display balance
        System.out.println("Current Balance: " + acc.getBalance());
    }
}
