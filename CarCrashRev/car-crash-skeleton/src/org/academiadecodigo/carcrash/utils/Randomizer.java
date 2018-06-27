package org.academiadecodigo.carcrash.utils;

import org.academiadecodigo.carcrash.CarType;

public class Randomizer {

    public static int randomNumberGenetator(){
        return (int) (Math.random() * CarType.values().length);
    }


}
