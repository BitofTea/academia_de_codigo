public class Main {
    
    public static void main(String[] args) {

        Wallet gucci = new Wallet();
        BankAccount millenium = new BankAccount();

      Person seantaylor = new Person("Sean Taylor", gucci, millenium);

        System.out.println(seantaylor.getName() + " " + seantaylor.getBankaccount());
    }

}
