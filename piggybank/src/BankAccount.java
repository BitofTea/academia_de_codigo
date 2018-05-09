public class BankAccount {

    static double balance = 100;

    public static void withdraw(double amount) {
        balance = balance - amount;

    }

    public static void deposit(double amount) {
        balance = balance + amount;
    }

    public static String currentbalance() {
        return "The balance of this account is:" + balance;
    }

    public BankAccount() {

    }


}
