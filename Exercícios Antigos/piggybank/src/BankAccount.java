public class BankAccount {

    private int balance = 60;


    public int getBalance() {
        return balance;
    }

    public int withdraw(int amount) {
        return balance = balance - amount;

    }

     public void deposit(int amount){
        balance = balance + amount;

    }
    @Override
    public String toString(){
         return "balance is" + " " + balance;
    }

}



