package org.academiadecodigo.carcrash.field;

public class PositionTester {

    public static void main(String[] args) {

        Position position = new Position();
        //Field.init(10,10);

        System.out.println(position);
        position.moveRight(0);

        System.out.println(position);
        position.moveDown(0);

        System.out.println(position);
        position.moveDown(1);

        System.out.println(position);
        position.moveDown(2);


    }
}
