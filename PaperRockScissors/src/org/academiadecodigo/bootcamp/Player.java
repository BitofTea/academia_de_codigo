package org.academiadecodigo.bootcamp;

public class Player {

    private String name;



    public Hand showhand() {
        double random = Math.random();

        if (random < 0.3) {
            return Hand.ROCK;
        }

        if (random < 0.7) {
            return Hand.PAPER;
        }

        return Hand.SCISSOR;

    }


}
