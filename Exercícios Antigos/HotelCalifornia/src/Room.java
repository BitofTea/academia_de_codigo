public class Room {

    private boolean available;

    public Room(boolean available) {
        this.available = available;
        //this room number
    }

    public boolean isAvailable() {
        return available;
    }

    public void occupy() {
        this.available = false;
    }

    public void vacated() {
        this.available = true;
    }
}