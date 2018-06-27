package org.academiadecodigo.genie;

//A maximum number of wishes is configured when released from the lamp
//Grants one wish at a time
//Grants all wishes, even if the configured limit has already been reached
//Can recharge a magic lamp if recycled by it
//Will not grant any more wishes after being recycled
//Can only be recycled once


public class RecyclableDemon extends Genie {

    private boolean recycled;

    public RecyclableDemon(int maxWishes) {
        super(maxWishes);

    }

    @Override
    public void grantWish() {

        if (recycled) {
            System.out.println("You can't have more wishes!");
        }

        super.grantWish();
    }

    public boolean recycle() {

        if (recycled) {
            return false;
        }

        recycled = true;
        return true;

    }


}
