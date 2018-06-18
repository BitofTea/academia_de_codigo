public class Person {

    private String name;
    private Hotel myHotel;
    private int key;


    public Person(String name) {
        this.name = name;
        this.key = -1;
    }


    public void checkIn(Hotel myHotel) {

        if (this.myHotel != null) {
            System.out.println(this.name + ": I checked In at the Hotel");
            return;
        }

        key = myHotel.checkIn();

        if (key < 0) {
            System.out.println(this.name + ": No availability of rooms in the Hotel");

        }

        this.myHotel = myHotel;
        System.out.println(this.name + ": checking in room" + key);

    }

    public void checkOut() {

        if (this.myHotel == null || this.key < 0) {
            System.out.println(this.name + ": I' m not checked at the Hotel");


        }

        this.myHotel.checkOut(key);
        this.myHotel = null;
        System.out.println(this.name + ": checking out!");

    }
}