import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class ATM {
    private Map<String, Account> accounts;
    private Account currentAccount;

    public ATM() {
        accounts = new HashMap<>();
        // Sample accounts (replace with your data or integrate with a database)
        accounts.put("123456", new Account("123456", "1234", 1000));
        accounts.put("789012", new Account("789012", "5678", 500));
    }

    public void login(String accountNumber, String pin) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            if (account.getPin().equals(pin)) {
                currentAccount = account;
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid PIN!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    public void deposit(double amount) {
        if (currentAccount != null) {
            currentAccount.deposit(amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Please log in first!");
        }
    }

    public void withdraw(double amount) {
        if (currentAccount != null) {
            currentAccount.withdraw(amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Please log in first!");
        }
    }

    public double checkBalance() {
        if (currentAccount != null) {
            return currentAccount.getBalance();
        } else {
            System.out.println("Please log in first!");
            return 0;
        }
    }

    public void logout() {
        currentAccount = null;
        System.out.println("Logged out successfully!");
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Login");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Logout");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = scanner.next();
                    System.out.print("Enter PIN: ");
                    String pin = scanner.next();
                    atm.login(accNum, pin);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Your balance: " + atm.checkBalance());
                    break;
                case 5:
                    atm.logout();
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

