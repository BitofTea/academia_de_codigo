package org.academiadecodigo.genie;

//A maximum number of wishes is configured when released from the lamp
//Grants one wish at a time
//All wishes are granted, if the configured limit (maxWishes) has not been reached.


public class HappyGenie extends Genie {


    public int grantedWishes;


    public HappyGenie(int maxWishes) {
        super(maxWishes);

        grantedWishes = 0;

    }
    @Override
    public void grantWish(){

        if(grantedWishes <= getMaxWishes()){
            System.out.println("Your wish have been granted!");
        }

        super.grantWish();
        grantedWishes++;
    }
}
