package org.academiadecodigo.bootcamp.c;

public class Garagem {

    private Vehicle[] spots;
    private int freeSpots;


    public Garagem(int spots) {

        this.spots = new Vehicle[spots];
        freeSpots = this.spots.length;

    }

    public boolean park(Vehicle vehicle) {

        for (int i = 0; i < spots.length; i++) {

            if (spots[i] != null) {
                continue;

            }

            vehicle.park(i);

            spots[i] = vehicle;

            freeSpots--;
            return true;
        }
        return false;
    }

    public boolean unpark(int spot) {

        if (spot > spots.length - 1) {
            return false;
        }

        if (spots[spot] == null) {
            return false;

        }

        spots[spot] = null;
        freeSpots++;
        return true;

    }


    public boolean unpark(Vehicle vehicle) {

        if (!vehicle.isparked()) {
            return false;

        }

        int spot = vehicle.getParkingSpot();
        return unpark(spot);

    }


    public int getCappacity() {
        return spots.length;
    }

    public int getFreeSpots() {
        return freeSpots;
    }


    /**
     * Este método é apenas para impressao do estado da garagem (para ajudar)
     * Descomentar quando a classe estiver implementada
     * Assume a existencia de uma propriedade `spots`
     */

    @Override
    public String toString() {
        String garageRepresentation = "";


        for (int i = 0; i < spots.length; i++) {
            garageRepresentation += "|" + (spots[i] != null ? spots[i].getBrand().substring(0, 3) : " " + i + " ");
        }
        garageRepresentation += "|";


        return garageRepresentation;
    }
}
