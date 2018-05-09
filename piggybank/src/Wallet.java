public class Wallet {

    static double cash = 50;

    public static void withdraw(double amount) {
        cash = cash - amount;

    }

    public static void deposit(double amount) {
        cash = cash + amount;
    }
    public static String currentcash() {
        return "The cash flow on this wallet is:" + cash;
}
