package org.academiadecodigo.genie;

//A maximum number of wishes is configured when released from the lamp
//Grants one wish at a time
//Grants only one wish, even if the configured limit has not been reached


public class GrumpyGenie extends Genie {

    //public int grantedWishes;
    private boolean wishGranted;


    public GrumpyGenie(int maxWishes) {
        super(maxWishes);

        wishGranted = false;
        //grantedWishes = 0;

    }

    @Override
    public void grantWish() {


        if (wishGranted) {
            return;
        }

        super.grantWish();
        wishGranted = true;
    }
    /*}

    @Override
    public void grantWish() {

        if (grantedWishes < getMaxWishes() && grantedWishes == 1) {

            System.out.println("One wish has been granted!");
        }
        super.grantWish();
        grantedWishes++;
    }*/
}

