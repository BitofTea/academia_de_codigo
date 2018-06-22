package org.academiadecodigo.bootcamp.c;

public class Garagem {

    private Vehicle[] spots;
    private int freeSpots;


    public Garagem(int spots) {

        this.spots = new Vehicle[spots];
        freeSpots = this.spots.length;

    }

    public boolean park() {


        for (int i = 0; i < spots.length; i++) {

            if (spots[i]){
                continue;
            }


            spots[i] = true;
            freeSpots--;
            return true;

        }

        return false;

    }


    public boolean unpark(int spotsNumber) {

        if (spotsNumber > spots.length - 1) {
            return false;
        }

        if (!spots[spotsNumber]) {
            return false;

        }

        spots[spotsNumber] = false;
        freeSpots++;
        return true;

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
 /*  @Override
    public String toString() {
        String garageRepresentation = "";


        for (int i = 0; i < spots.length; i++) {
            garageRepresentation += "|" + (spots[i] != null ? spots[i].getBrand().substring(0, 3) : " " + i + " ");
        }
        garageRepresentation += "|";


        return garageRepresentation; */
    }
}
