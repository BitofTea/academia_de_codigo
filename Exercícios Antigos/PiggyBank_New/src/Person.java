public class Person {

    //Field com o estado do objecto Pessoa com as suas propriedades:
    private String name;
    private Bank bank;
    private Wallet wallet;

    //Método para criar o Comportamento do objecto Pessoa(com as suas propriedades, variáveis):
    public Person(String name, Bank bank, Wallet wallet, int money) {
        this.name = name;
        this.bank = bank;
        this.wallet = wallet;

        //Método para pôr dinheiro na carteira
        wallet.add(money);

    }
    //Métodos que nos dão/devolvem o valor do dinheiro gasto:

    //gasta/usa o dinheiro na carteira
    public int spend(int money) {
        return wallet.use(money);
    }

    //põe/acrescenta dinheiro á carteira
    public void fillWallet(int money){
        wallet.add(bank.withdraw(money));
    }

    //guarda/deposita o dinheiro no banco
    private void saveMoney(int money){
        bank.deposit(wallet.use(money));
    }

    //Método para converter/representar o objecto Pessoa para uma string(??)
    @Override
    public String toString(){
        return "Person{" + "name=" + name + ", Bank=" + bank + ", wallet=" +wallet + '}';
    }

}
