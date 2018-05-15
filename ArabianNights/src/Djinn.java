public class Djinn {

    //para saber o nº max de wishes.
    private int maxWishes;


    public Djinn(int maxWishes) {
        this.maxWishes = maxWishes;
    }
// comportamento que concede desejos ao Djinn
    public void grantWish() {

        System.out.println("Your wish is granted!");
    }

    public int getMaxWishes() {
        return maxWishes;
    }

}















