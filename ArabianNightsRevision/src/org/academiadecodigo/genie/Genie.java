package org.academiadecodigo.genie;


public class Genie {

    public int maxWishes;


    public Genie(int maxWishes) {
        this.maxWishes = maxWishes;

    }
    public void grantWish(){
        System.out.println("Wish granted!");

    }

    public int getMaxWishes() {
        return maxWishes;
    }
}