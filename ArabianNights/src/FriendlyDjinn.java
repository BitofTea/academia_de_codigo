public class FriendlyDjinn extends Djinn {

    private int wishesGranted;

    public friendlyDjinn(int maxWishes) {
        super(maxWishes);
    }

    @Override
    public void grantWish() {

        if (wishesGranted <= this.getMaxWishes()) {
            this.grantWish();
            this.wishesGranted ++;

        } else {
            System.out.println("I have no more wishes to grant!");
        }
    }

}
