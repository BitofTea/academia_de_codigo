public class Hotel {

    private Room[] rooms;
    private int key;


    public Hotel(int rooms) {
        this.rooms = new Room[rooms];

        for (int i = 0; i < this.rooms.length; i++) {

            this.rooms[i] = new Room();

        }

    }

    public int checkIn() {

        for (int i = 0; i < this.rooms.length; i++) {

            boolean available = this.rooms[i].isAvailable();

            if (rooms[i].isAvailable()) {
                rooms[i].occupy();
                return i;
            }

        }

        return -1;

    }

    public void checkOut(int key) {

        this.key = key;

        for (int i = 0; i < this.rooms.length; i++) {

            boolean available = this.rooms[i].isAvailable();

            if (available) {
                rooms[i].vacated();

                System.out.println("Thank you for your visit. Hope you had a nice stay!");

            }

        }


    }

}







    











