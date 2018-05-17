package org.acdemiadecodigo.bootcamp;

abstract public class Enemy extends GameObject {

    private int health = 50;
    private boolean isDead;

    public boolean isDead() {
        // TODO: implementar isDead
        if (health <= 0) {
            isDead = true;

        } else

            return false;
    }

    public void hit(int damage) {
        health = health - damage;
    }

    @Override
    public String getMessage() {
        return "Olha... estou a morrer... Nao percebo nada de jogos. (sou um inimigo)";
    }
}