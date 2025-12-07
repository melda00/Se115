import java.util.Scanner;

public class BankAccount {
    private int accountID;
    private int balance;

    public BankAccount(int accountID, int initialBalance) {
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setBalance(int newbalance) {
        if (newbalance >= 0) {
            this.balance = newbalance;
        } else {
            System.out.println("balance is cannot be negative");
        }

    }

    public int deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }

        return this.balance;
    }

    public void withdraw(int moneyUserWant) {
        if (moneyUserWant <= this.balance) {
            this.balance -= moneyUserWant;
            System.out.println(this.balance);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("do you want to borrow");
            String borrowed = sc.nextLine();
            if (borrowed.equals("yes")) {
                this.balance -= moneyUserWant;
                System.out.println(this.balance);
            } else {
                System.out.println("insufficient balance");
            }
        }

    }

    public void accountDetails() {
        System.out.println(this.accountID);
        System.out.println(this.balance);
    }
}
