package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.Directions;
import org.academiadecodigo.carcrash.Game;
import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

//Different types of cars exist
//Cars move at different speeds and in different ways
//A car can crash at any time


abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;
    private boolean crashed = false;
    private Directions currentDirection;

    public Car() {
        this.pos = new Position();
        this.currentDirection = Directions.values()[(int) (Math.random() * Directions.values().length)];
    }

    public void moveCar() {

        if (!crashed) {

            int chooseDir = (int) (Math.random() * 10);

            if (chooseDir > 7) {
                this.currentDirection = Directions.values()[(int) (Math.random() * Directions.values().length)];
            }
            switch (currentDirection) {
                case UP:
                    moveUp();
                    break;
                case DOWN:
                    moveDown();
                    break;
                case LEFT:
                    moveLeft();
                    break;
                case RIGHT:
                    moveRight();


            }
        }
    }

    private void moveDown(){
        if(!checkBottomLimit()) {
            pos.setRow(this.pos.getRow() + 1);
        } else {
            moveUp();
            currentDirection = Directions.UP;
        }
    }

    private void moveUp(){
        if(!checkTopLimit()) {
            pos.setRow(this.pos.getRow() - 1);
        } else {
            moveDown();
            currentDirection = Directions.DOWN;
        }
    }

    private void moveLeft(){
        if(!checkLeftLimit()) {
            pos.setCol(this.pos.getCol() - 1);
        } else {
            moveRight();
            currentDirection = Directions.RIGHT;
        }
    }

    private void moveRight(){
        if(!checkRightLimit()) {
            pos.setCol(this.pos.getCol() + 1);
        } else {
            moveLeft();
            currentDirection = Directions.LEFT;
        }
    }

    private boolean checkRightLimit(){
        return pos.getCol() == Field.getWidth() - 1;
    }

    private boolean checkLeftLimit(){
        return pos.getCol() == 0;
    }

    private boolean checkTopLimit(){
        return pos.getRow() == 0;
    }

    private boolean checkBottomLimit(){
        return pos.getRow() == Field.getHeight() - 1;
    }

    public void checkCarCrashed(Car[] cars){

        for (int i = 0; i < cars.length - 1; i++) {

            for (int j = i + 1; j < cars.length; j++) {

                if (cars[i].pos.getRow() == cars[j].pos.getRow() && cars[i].pos.getCol() == cars[j].pos.getCol()) {
                    cars[i].crashed = true;
                    cars[j].crashed = true;
                }
            }
        }

    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }
}
