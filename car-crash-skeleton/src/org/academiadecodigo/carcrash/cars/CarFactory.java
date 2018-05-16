package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    public static Car getNewCar() {


        if (Math.random() < 0.5) {

            Car J = new JaguarCar();
            return J;

        } else {

            Car F = new FiatCar();
            return F;


        }


    }

}



































