package org.academiadecodigo.bootcamp.d;
s
public class GaragemDosRicos extends Garagem {

    private String[] richBrands = {"Lamborghini", "Mercedes", "Ferrari", "Maseratti"};


    public GaragemDosRicos(int cappacity) {
        super(cappacity);

    }

    public boolean isRichBrand(Vehicle vehicle) {
        //for (int i = 0; i < richBrands.length; i++)

        for (String brand : richBrands) {

            if (vehicle.getBrand().equals(brand)) {
                return true;

            }

        }
        return false;
    }

    @Override
    public boolean park(Vehicle vehicle) {

        if (!isRichBrand(vehicle)) {
            return false;

        }

        return super.park(vehicle);

    }

}