package org.academiadecodigo.garage;

public class Garage {

    private boolean[] spots;
    private int freeSpots;

    public Garage(int spots) {

        this.spots = new boolean[spots];
        freeSpots = this.spots.length;

    }

    public boolean park(int spotsNumber) {

        if (spotsNumber > spots.length - 1) {
            return false;
        }

        spots[spotsNumber] = true;

        freeSpots--;
        return true;

    }

    public boolean unPark(int spotsNumber) {

        if (spotsNumber <= spots.length -1) {
            return true;
        }

        return false;

        }

        public int getCappacity () {
            return spots.length;
        }

        public int getFreeSpots () {
            return freeSpots;
        }


    }


