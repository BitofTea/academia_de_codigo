package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Fiat;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Mustang;

public class CarFactory {

    public static Car getNewCar() {

        Car car;

        int random = (int) (Math.random() * CarType.values().length);
        CarType carType = CarType.values()[random];

        switch (carType) {
            case FIAT:
                car = new Fiat();
                break;
            case MUSTANG:
                car = new Mustang();
                break;
            default:
                car = new Fiat();

        }return car;
    }
}
