public class Bank {

    private int money = 20;

    public int getMoney() {
        return money;
    }

    public int withdraw(int money) {


        if (money > this.money) {
            int removedMoney = this.money;
            this.money = 0;
            return removedMoney;

        }
        this.money = this.money - money;
        return money;
    }

    public void deposit(int money){
        this.money = this.money + money;
    }

    @Override
    public String toString(){
        return "Bank{" + "money=" + money + '}';
    }

}
