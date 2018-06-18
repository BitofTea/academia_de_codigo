public class Main {

    public static void main(String[] args) {


        Hotel myHotel = new Hotel(2);

        Person person1 = new Person("Bárbara");
        Person person2 = new Person("João");


        person1.checkIn(myHotel);
        person2.checkIn(myHotel);

        person1.checkOut();
        person2.checkOut();

       // String firstName();
        //String lastName();
        //String fullName = firstName + "" + lastName;


    }

}
