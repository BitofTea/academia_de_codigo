package org.academiadecodigo.garage;

public class Garage {

    private boolean[] spots;

    public Garage(int numberOfPlaces) {
        spots = new boolean[numberOfPlaces];

    }

    public int park() {
        if (spots[]) {
            return false;
        }

        spots[] = true;
        return true;
    }

    public boolean unpark(int place) {
        if (spots[place]) {
            spots[place] = false;
            return true;
        }

        return false;
    }
    @Override
    public  String toString(){
        String representation = "|";

        for(int i = 0; i < spots.length; i++){
            representation += spots[i] ? "X" : i;
            representation += "|" ;

        }
           return representation;
    }

}

