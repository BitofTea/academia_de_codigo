package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarType;

public class Mustang extends Car {

    private int moves = 0;
    private final static int MOVES = 2;


    public Mustang() {
        super(CarType.MUSTANG,new Position(0,0));

    }

    @Override
    public void move() {
        moves++;


        if(moves < MOVES){
            accelerate(chooseDirection(), 1);

        }
    }
}