public class Person {

    private String name;
    private Wallet mywallet;
    private BankAccount bankaccount;


    public Person(String name, Wallet mywallet, BankAccount bankaccount) {
        this.name = name;
        this.mywallet = mywallet;
        this.bankaccount = bankaccount;

    }

    public String getName() {
        return name;
    }

    public Wallet getMywallet() {
        return mywallet;

    }

    public BankAccount getBankaccount() {
        return bankaccount;
    }

    public void setMywallet(Wallet mywallet) {
        this.mywallet = mywallet;
    }

    public void setBankaccount(BankAccount bankaccount) {
        this.bankaccount = bankaccount;
    }
}
Person.withdraw(25);


