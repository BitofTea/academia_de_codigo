package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.cars.Car;

public class Mustang extends Car {

    private int MOVES = 3;


    public Mustang(){
        super();

    }

    @Override
    public void move() {
        ++;

    }
}