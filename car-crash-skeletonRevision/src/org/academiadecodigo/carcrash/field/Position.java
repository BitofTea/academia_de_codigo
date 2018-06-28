package org.academiadecodigo.carcrash.field;

public class Position {


    //private int with = 5;
    //private int height = 5;
    private int col = 7;
    private int row = 7;

    public Position() {
        this.col = (int) (Math.random() * Field.getWidth());
        this.row = (int) (Math.random() * Field.getHeight());

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void moveUp(int i) {

        if (row - i > 0) {
            row -= i;
        } else {
            row = 0;
        }
    }

    public void moveDown(int i) {

        if (row + i < Field.getHeight()) {
            row += i;
        } else {
            row = Field.getHeight();
        }
    }

    public void moveLeft(int i) {

        if (col - i > 0) {
            col -= i;
        } else {
            col = 0;
        }
    }

    public void moveRight(int i) {

        if (col + i < Field.getWidth()) {
            col -= i;
        } else {
            col = Field.getWidth();
        }
    }

    public void move(Direction direction, int i) {


        switch (direction) {

            case UP:
                moveUp(i);
                System.out.println("Move direction UP");
                break;

            case DOWN:
                moveDown(i);
                System.out.println("Move direction DOWN");
                break;

            case LEFT:
                moveLeft(i);
                System.out.println("Move direction LEFT");
                break;

            case RIGHT:
                moveRight(i);
                System.out.println("Move direction RIGHT");
                break;

        }
    }

    @Override
    public String toString() {
        return "column=" + " " + col + "row=" + " " + row;

    }
}
