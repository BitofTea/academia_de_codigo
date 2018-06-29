package org.academiadecodigo.carcrash.field;

public class PositionTester {

    public static void main(String[] args) {

        Field.init(10, 10);
        Position position = new Position(0,0);

        System.out.println(position);
        System.out.println("########");

        position.moveRight(1);
        System.out.println(position);

        position.moveDown(1);
        System.out.println(position);

        position.moveUp(1);
        System.out.println(position);

        position.moveLeft(2);
        System.out.println(position);

        position.moveLeft(1000);
        System.out.println(position);

        position.moveUp(1111);
        System.out.println(position);

        position.moveRight(15);
        System.out.println(position);

        position.moveDown(15);
        System.out.println(position);

    }
}
