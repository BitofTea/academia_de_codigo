package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Direction;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */

    private Position pos;
    private int speed;
    private boolean crashed;


    public Car() {
        pos = new Position();
        speed = 2;
        crashed = false;
    }

    public void move() {
        // pick a random direction
        // move in that direction (pos.move(direction))

        Direction[] directions = Direction.values();
        int random = (int) (Math.random() * directions.length);

        pos.move(directions[random]);
    }


    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;

    }

    public void crashed() {
        crashed = true;
    }


    public boolean samePlace(Car car) {
        return this.pos.getCol() == car.pos.getCol() &&
                this.pos.getRow() == car.pos.getRow();
    }
}
