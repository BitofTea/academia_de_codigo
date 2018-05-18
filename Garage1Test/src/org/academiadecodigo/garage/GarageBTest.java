package org.academiadecodigo.garage;

public class GarageBTest {

    public static void main(String[] args) {

        Garage garage = new Garage(10);
        System.out.println(garage);


        System.out.println("occupy place 1 " + garage.park(1));
        System.out.println(garage);


        System.out.println("occupy place 1 again " + garage.park(1));
        System.out.println(garage);

        System.out.println("unpark empty spot " + garage.unpark(0));
        System.out.println(garage);

        System.out.println("unpark occupied spot " + garage.unpark(1));
        System.out.println(garage);

        System.out.println("unpark empty spot " + garage.unpark(1));
        System.out.println(garage);



    }
}
