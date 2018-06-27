package org.academiadecodigo.carcrash.field;

public class Position {

    private int col;
    private int row;

    public Position() {
        this.col = (int) (Math.random() * Field.getWidth() - 1);
        this.row = (int) (Math.random() * Field.getHeight() - 1);

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

        if (row + i > 0) {
            row += i;
        } else {
            row = 0;
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

        if (col + i > 0) {
            col -= i;
        } else {
            col = 0;
        }
    }

    public void move(Direction direction) {

        int i = 0;

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
        return "column=" + col + "row=" + row;

    }
}
