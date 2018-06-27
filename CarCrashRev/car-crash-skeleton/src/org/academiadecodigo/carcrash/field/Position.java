package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.Game;

//Describes where a Car lives on the Grid
//Updating position results in moving the Car



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



    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

   /* @Override
    public String toString(){
    return "column=" + column + "row=" + row;

    } */
}
