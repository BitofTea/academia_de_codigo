public class GrumpyDjinn extends Djinn{

    private boolean wishGranted;

    public GrumpyDjinn(int maxWishes) {
        super(maxWishes);
        wishGranted = false;

        System.out.println("New Grumpy Djinn!");
    }

    @Override
    public void grantWish() {

        if (wishGranted) {
            System.out.println("I don't grant more wishes!");
            return;

        } else {
            super.grantWish();
            wishGranted = true;
        }
    }
}
