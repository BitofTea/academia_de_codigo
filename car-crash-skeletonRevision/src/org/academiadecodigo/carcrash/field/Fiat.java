package org.academiadecodigo.carcrash.field;

import javafx.scene.control.skin.TextInputControlSkin;
import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarType;

public class Fiat extends Car {

    private int moves = 0;
    private final static int MOVES_AFTER_BREAK = 6;

    public Fiat() {
        super(CarType.FIAT, new Position(0,0));

    }

    @Override
    public void move() {
        moves++;

        if (moves < MOVES_AFTER_BREAK) {
            accelerate(chooseDirection(), 1);

        }
    }
}



