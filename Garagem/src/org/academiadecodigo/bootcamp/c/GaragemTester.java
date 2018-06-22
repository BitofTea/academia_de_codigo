package org.academiadecodigo.bootcamp.c;

public class GaragemTester {

    public static String[] brands = {"Audi", "Mercedes", "Ferrari", "Maserati", "Bentley", "Lamborghini"};

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[brands.length];
        Garagem g = new Garagem(vehicles.length);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = new Vehicle(brands[i]);
        }

        System.out.println("Should be empty after creating");
        System.out.println(g);
        System.out.println("----------");

        for (int i = 0; i < g.getCappacity(); i++) {
            System.out.println("Should be able to park");
            System.out.println("parked? " + g.park(vehicles[i]));
            System.out.println(g);
            System.out.println("----------");
        }

        System.out.println("Should not be able to park after capacity has been reached");
        System.out.println("parked? " + g.park(new Vehicle("Fiat")));
        System.out.println(g);
        System.out.println("----------");

        System.out.println("Should be able to unpark a busy spot");
        System.out.println("unparked? " + g.unpark(1));
        System.out.println(g);
        System.out.println("----------");


        System.out.println("Should not be able to unpark an empty spot");
        System.out.println("unparked? " + g.unpark(1));
        System.out.println(g);
        System.out.println("----------");

        System.out.println("Should be able to unpark a parked car");
        System.out.println("unparked? " + g.unpark(vehicles[2]));
        System.out.println(g);
        System.out.println("----------");

        System.out.println("Should not be able to unpark an unparked car");
        System.out.println("unparked? " + g.unpark(vehicles[2]));
        System.out.println(g);
        System.out.println("----------"); */

    }
}
