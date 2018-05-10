public class Hotel {

    private Room[] rooms;


    public Hotel(int rooms) {
        this.rooms = new Room[rooms];

        for (int i = 0; i < this.rooms.length; i++) {

            this.rooms[i] = new Room(true);

        }

    }

    public int checkin() {

        for (int i = 0; i < this.rooms.length; i++) {

            boolean available = this.rooms[i].isAvailable();

            if (available) {
                rooms[i].occupy();

                return i;
            }

        }

        return -1;

    }

}

    public void Checkout( Person who) {

        for (int i = 0; i < this.rooms.length; i++) {

            boolean available = this.rooms[i].isAvailable();

            if (available) {
                rooms[i].vacated();

                System.out.println("Thank you for your visit. Hope you had a nice stay!");



            }

        }


    }
    











