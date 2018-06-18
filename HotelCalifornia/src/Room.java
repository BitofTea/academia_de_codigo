public class Room {

    private boolean available;

    public Room() {
        available = true;

    }

    public boolean isAvailable() {
        return available;
    }

    public void occupy() {
        available = false;
    }

    public void vacated() {
        available = true;
    }
}