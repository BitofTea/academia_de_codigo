public class Main {

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        Bank bank1 = new Bank();

        Person person1 = new Person("Gabi", bank1, wallet1, 0);
        System.out.println(person1);

        Person person2 = new Person("Rui", bank1, wallet2, 0);
        System.out.println(person2);

        person1.spend(0);
        System.out.println(person1);


        person2.fillWallet(50);
        System.out.println(person2);

    } //Nota: há valores a serem subtraidos aos teste que não percebo onde estão?
}
