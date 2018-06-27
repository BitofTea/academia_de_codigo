package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.CarType;
import org.academiadecodigo.carcrash.utils.Randomizer;

public class CarFactory {

    public static  Car getNewCar() {

        int carTypes = Randomizer.randomNumberGenetator();
        CarType carType = CarType.values()[carTypes];
        Car c;

        switch (carType){

            case RENAULT9:
                c = new Renault9();
                break;
            case TESLA:
                c = new Tesla();
                break;

                default:
                    c = new Ford();
        }
        return c;
    }
}
