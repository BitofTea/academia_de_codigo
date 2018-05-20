package org.academiadecodigo.bootcamp;

public class Game {

    private Player one = new Player();
    private Player two = new Player();

    private int scoreOne = 0;
    private int scoreTwo = 0;

    public void start(int rounds) {

        for (int i = 0; i < rounds; i++) {

            Hand handOne = one.showhand();
            Hand handTwo = two.showhand();

            System.out.println("Player one chooses: " + handOne);
            System.out.println("Player two chooses: " + handTwo);

            switch (handOne) {

                case ROCK:
                    if (handTwo == Hand.PAPER) {
                        scoreTwo++;
                        System.out.println("Player two wins this round");
                    }
                    if (handTwo == Hand.SCISSOR) {
                        scoreOne++;
                        System.out.println("Player one wins this round");
                    }
                    break;

                case PAPER:
                    if (handTwo == Hand.ROCK) {
                        scoreOne++;

                        System.out.println("Player one wins this round");
                    }

                    if (handTwo == Hand.SCISSOR) {
                        scoreTwo++;

                        System.out.println("Player two wins this round");
                    }
                    break;

                case SCISSOR:
                    if (handTwo == Hand.ROCK) {
                        scoreTwo++;
                        System.out.println("Player two wins this round");
                    }

                    if (handTwo == Hand.PAPER) {
                        scoreOne++;

                        System.out.println("Player one wins this round");
                    }
                    break;

            }

        }

        if (scoreTwo == scoreOne) {
            System.out.println("It's a tie!");

        } else if (scoreTwo < scoreOne) {
            System.out.println("Player One wins!");

        } else {
            System.out.println("Player Two wins!");
        }


    }
}

