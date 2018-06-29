package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

//Diferent types of cars exist
//Cars move at different speeds and in different ways
//A car crash at any time


abstract public class Car {

    /** The position of the car on the grid */
    private Position pos;

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }
}
