package org.academiadecodigo.bootcamp;

public class Garage {

    private Car[] spots;

    public Garage(int nrOfSpots) {
        this.spots = new Car[nrOfSpots];
    }

    public boolean park(Car car) {

        for (int i = 0; i < spots.length; i++) {

            if (spots[i] == null) {
                spots[i] = car;
                return true;
            }
        }

        return false;
    }

    public boolean unpark(Car car) {

        for (int i = 0; i < spots.length; i++) {

            if (spots[i] == car) {
                spots[i] = null;
                return true;

            }
        }

        return false;
    }
}