public class Wallet {

    //Field com o estado do objecto Carteira
    private int money = 50;

    //Métodos para o comportamento do objecto Carteira:
    //Carteira devolve/dá dinheiro
    public int getMoney() {
        return money;
    }

    //método do objecto Carteira para pôr/acrescentar dinheiro
    public void add(int money) {
        this.money = this.money - money;
    }

    //Método para o funcionamento/uso da carteira:
    public int use(int money) {

        //não ter dinheiro, estar vazia = 0,  Nota: este if e o RemovedMoney ??
        if (money > this.money) {
            int removedMoney = this.money;
            this.money = 0;
            return removedMoney;
        }
        //pode ter dinheiro.
        this.money = this.money - money;
        return money;
        // isto parece uma repetição, redundante do método add ??
    }

    @Override
    public String toString() {
        return "Wallet{" + "money=" + money + '}';
    }
}
