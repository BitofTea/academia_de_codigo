package org.academiadecodigo.carcrash.field;

public class PositionTester {

    public static void main(String[] args) {

        Position position = new Position();


        System.out.println(position);
        position.moveRight(2);
        System.out.println(position);
        position.moveDown(3);
        System.out.println(position);

    }
}
