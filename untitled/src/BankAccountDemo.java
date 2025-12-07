public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(25403, 500);
        bankAccount.deposit(100);
        bankAccount.withdraw(800);
        bankAccount.accountDetails();
    }
}

