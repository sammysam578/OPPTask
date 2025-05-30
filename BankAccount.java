public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    
    public BankAccount(String number, String name, double balance) {
        accountNumber = number;
        accountHolderName = name;
        if (balance >= 0) {
            accountBalance = balance;
        } else {
            accountBalance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance = accountBalance + amount;
            System.out.println(amount + " deposited.");
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance = accountBalance - amount;
                System.out.println(amount + " withdrawn.");
            } else {
                System.out.println("Not enough balance.");
            }
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + accountBalance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("111222", "sam", 500);
        acc.showDetails();

        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(700);  

        acc.showDetails();
    }
}

    

