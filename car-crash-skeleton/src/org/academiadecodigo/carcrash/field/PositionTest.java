package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.Direction;

public class PositionTest {

    public static void main(String[] args) {


        Field.init(5,5);
        Position position = new Position(0,0);
        System.out.println("initial position: " + position);

        position.move(Direction.LEFT);
        System.out.println(position);

        position.move(Direction.UP);
        System.out.println(position);

        position.move(Direction.RIGHT);
        System.out.println(position);

        position.move(Direction.DOWN);
        System.out.println(position);


    }

}
