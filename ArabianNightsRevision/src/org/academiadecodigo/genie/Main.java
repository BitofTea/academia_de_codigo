package org.academiadecodigo.genie;

public class Main {

    public static void main(String[] args) {

        MagicLamp ml = new MagicLamp(5);
        MagicLamp otherMl = new MagicLamp(5);

        System.out.println("These lamps are the same: " + ml.compare(otherMl));
        System.out.println("ml: " + ml);

        Genie[] genies = new Genie[8];

        for (int i = 0; i < 8; i++) {
            genies[i] = ml.rub();
        }

        System.out.println("Lamp after 8 rubs: " + ml);
        ml.recycle(genies[0]);

        for (Genie genie : genies) {
            if (genie instanceof RecyclableDemon) {
                ml.recycle(genie);
                break;
            }
        }

        System.out.println("Lamp after recycling: " + ml);

        ml.rub();
        ml.rub();

        System.out.println("These lamps are the same: " + ml.compare(otherMl));
        System.out.println("Final lamp state: " + ml);
    }
}
