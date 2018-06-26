public class Person {

    private String name;
    private Wallet myWallet;
    private BankAccount myBankAccount;


    public Person(String name, Wallet myWallet, BankAccount myBankAccount, int money) {
        this.name = name;
        this.myWallet = myWallet;
        this.myBankAccount = myBankAccount;

        myWallet.deposit(money);
    }

    public int getMoney(int money) {
        return myWallet.withdraw(money);
    }

    private void depositMoney(int money){
        myBankAccount.deposit(myWallet.withdraw(money));

    }
    @Override
    public String toString(){
        return name + ": Bank account" + " " + myBankAccount + " " + "and my Wallet" + " " + myWallet;
    }
}



