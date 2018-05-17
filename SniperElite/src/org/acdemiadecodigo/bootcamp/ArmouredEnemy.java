package org.acdemiadecodigo.bootcamp;

public class ArmouredEnemy extends Enemy {

    private int armour = 5;

    @Override
    public void hit(int damage) {

        if (armour <= 0) {
            super.hit(damage);
            return;
        }

        armour = armour - damage;

    }

}
