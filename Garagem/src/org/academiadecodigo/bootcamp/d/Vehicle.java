package org.academiadecodigo.bootcamp.d;

public class Vehicle {

    private String brand;
    private int parkingSpot;


    public Vehicle(String brand) {
        this.brand = brand;

    }

    public void park(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void unpark() {
        this.parkingSpot = -1;

    }

    public boolean isparked() {

        return parkingSpot != -1;

    }


    public int getParkingSpot() {
        return parkingSpot;


    }

    public String getBrand() {
        return brand;
    }

}


