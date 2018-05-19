package org.academiadecodigo.bootcamp;

public class Maintest {

    public static void main(String[] args) {

        Car c = new Car();
        Car b = new Car();

        Garage g = new Garage(2);

        System.out.println("parking car c: " + g.park(c));
        System.out.println("unparking car b: " + g.unpark(b));

        System.out.println("unparking car c: " + g.unpark(c));

        System.out.println("parking car b: " + g.park(b));
        System.out.println("parking car c: " + g.park(c));

        Car a = new Car();

        System.out.println("trying to park in full garage: " + g.park(a));

    }
}
