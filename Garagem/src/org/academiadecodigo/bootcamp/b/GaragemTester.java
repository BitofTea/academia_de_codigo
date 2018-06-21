package org.academiadecodigo.bootcamp.b;

public class GaragemTester {

    public static void main(String[] args) {

        Garagem g = new Garagem(10);
        System.out.println("Should be empty after creating");
        System.out.println(g);
        System.out.println("----------");

        for (int i = 0; i < g.getCappacity(); i++) {

            System.out.println("Should be able to park");
            System.out.println("parked? " + g.park());
            System.out.println(g);
            System.out.println("----------");
        }


        System.out.println("Should not be able to park after capacity has been reached");
        System.out.println("parked? " + g.park());
        System.out.println(g);
        System.out.println("----------");

        System.out.println("Should be able to unpark a busy spot");
        System.out.println("unparked? " + g.unpark(1));
        System.out.println(g);
        System.out.println("----------");

        System.out.println("Should be able to unpark a busy spot");
        System.out.println("unparked? " + g.unpark(0));
        System.out.println(g);
        System.out.println("----------");

        System.out.println("Should not be able to unpark an empty spot");
        System.out.println("unparked? " + g.unpark(0));
        System.out.println(g);
        System.out.println("----------");
    }
}
