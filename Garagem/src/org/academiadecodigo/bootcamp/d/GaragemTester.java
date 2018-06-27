package org.academiadecodigo.bootcamp.d;

public class GaragemTester {

    public static String[] brands = {"Lamborghini", "Mercedes", "Ferrari", "Maseratti", "Bentley", "Audi", "Fiat", "Renault"};

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[brands.length];
        Garagem g = new GaragemDosRicos(vehicles.length);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = new Vehicle(brands[i]);
        }

        System.out.println("Should be empty after creating");
        System.out.println(g);
        System.out.println("----------");

        for (int i = 0; i < g.getCappacity(); i++) {
            System.out.println("Going to park: " + vehicles[i].getBrand());
            System.out.println("parked? " + g.park(vehicles[i]));
            System.out.println(g);
            System.out.println("----------");
        }
    }
}