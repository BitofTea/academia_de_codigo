public class Main {
    
    public static void main(String[] args){

    Wallet wallet1 = new Wallet();

    BankAccount bankAccount1 = new BankAccount();


    Person person1 = new Person("Gabi", wallet1, bankAccount1,10);
        System.out.println(person1);

    }
}

//Nota: no main o resultado apresenta-me um valor da Wallet acrescido de 10. De onde é que isto vêm?