package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.Direction;

public class Position {

    private int column;
    private int row;

    public Position(int column, int row) {
        this.column = column;
        this.row = row;

    }

    public Position() {
        this.column = (int) (Math.random() * Field.getWidth());
        this.row = (int) (Math.random() * Field.getHeight());
    }

    public int getCol() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void move(Direction direction) {

        switch (direction) {

            case UP:
                moveUP();
                break;

            case DOWN:
                moveDOWN();
                break;

            case LEFT:
                moveLEFT();
                break;

            case RIGHT:
                moveRIGHT();
                break;

        }
    }

    public void moveUP() {

        if (row > 0) {
            row--;
        }
    }

    public void moveDOWN() {

        if (row < Field.getHeight() - 1) {
            row++;
        }
    }

    public void moveLEFT() {

        if (column > 0) {
            column--;
        }
    }

    public void moveRIGHT() {

        if (column < Field.getWidth() - 1) {
            column++;
        }
    }

    @Override
    public String toString(){
        return "column=" + column + " row=" + row;
    }
}
