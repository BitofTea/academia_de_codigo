public class Wallet {

    private int cash = 100;

    public int getCash() {
        return cash;
    }

    public int withdraw(int amount){
        return cash = cash - amount;

    }
    public int deposit(int amount) {
        return cash = cash + amount;
    }

    @Override
    public String toString() {
        return "is" + " " + cash;
    }

}
