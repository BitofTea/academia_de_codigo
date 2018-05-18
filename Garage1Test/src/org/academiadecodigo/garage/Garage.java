package org.academiadecodigo.garage;

public class Garage {

    private boolean[] spots;

    public Garage(int nrOfSpots) {
        // nrOfSpots é um número, que vai ser utilizado para construir um array de booleanos
        // nrOfSpots pode ser 1, 2, 3, 4, 5...
        spots = new boolean[nrOfSpots];
    }

    public boolean park(int spot) {
        if (spots[spot]) {
            return false;

        }

        spots[spot] = true;
        return true;
    }

    public boolean unpark(int spot) {
        if (spots[spot]) {
            spots[spot] = false;
            return true;

        }

        return false;

    }

    @Override
    public String toString() {
        String representation = "|";

        for (int i = 0; i < spots.length; i++) {
            representation += spots[i] ? "X" : i;
            representation += "|";

        }

        return representation;

    }

}
