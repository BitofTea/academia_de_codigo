package org.academiadecodigo.carcrash.field;

//Describes where a car lives on the grid
//Updating position results in moving the car

public class Position {

    private int col;
    private int row;


    public Position(int col, int row){
       this.col = col;
       this.row = row;
        System.out.println("this position");

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setRandom() {
        this.col = (int) (Math.random() * Field.getWidth());
        this.row = (int) (Math.random() * Field.getHeight());

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
            row = Field.getHeight() - 1;
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
            col += i;
        } else {
            col = Field.getWidth() - 1;
        }
    }

    public void moveInDirection(Direction direction, int i) {


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

    public boolean isOnEdge(Direction direction){

        //No caso dos carros chegarem à berma do Field, instruções para andarem noutra direcção
        return (direction == Direction.RIGHT && col = Field.getWidth() - 1 ||
                direction == Direction.LEFT && col = 0 ||
                direction == Direction.UP && row = 0 ||
                direction == Direction.DOWN && row = Field.getHeight() - 1);



    }

    @Override
    public String toString() {
        return "column=" + " " + col + "row=" + " " + row;

    }
}
