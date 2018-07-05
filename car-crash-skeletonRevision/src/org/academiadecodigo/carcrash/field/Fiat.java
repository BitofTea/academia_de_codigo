package org.academiadecodigo.carcrash.field;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarType;

public class Fiat extends Car {

    private int moves = 0;
    private final static int MOVES_AFTER_BREAK = 20;

    public Fiat() {
        super(CarType.FIAT, new Position());

    }

    @Override
    public void move() {
        moves++;

        if (moves < MOVES_AFTER_BREAK) {
            accelerate(chooseDirection(), 6);

        }

        accelerate(chooseDirection(), 2);

    }
}



