package org.academiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 10;


    private int cols;
    private int rows;
    private List<Cell> cells;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

    }

    public void init() {
        cells = new ArrayList<>();
        //Rectangle grid = new Rectangle(PADDING, PADDING, CELL_SIZE * cols, CELL_SIZE * rows);
        //grid.draw();

        //grid.setColor(Color.BLUE);
        //grid.fill();

        //Outra forma de fazer:
        //for (int i = 0; col < cols; i++) {
        //for (int i = 0; row < rows; i++) {

        for (int col = 0; col < cols; col++) {

            for (int row = 0; row < rows; row++) {

                cells.add(new Cell(col * CELL_SIZE + PADDING, row * CELL_SIZE + PADDING));

                //if(cells == Grid){
                //return True,
                //Show();
                //}

            }
        }
    }

    public void paint(int col, int row) {
        Cell cell = cells.get(row + col * cols);

        if (cell.isFilled()) {
            cell.unPaint();
            return;
        }

        cell.paint();
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

   /* @Override
    public String toString() {
        String representation = "";

        for (Cell cell : cells) {
            if (cell.isFilled()) {
                representation = representation + "1";
                continue;
            }

            representation = representation + "0";
        }

        return representation;
    }*/
}

    /*public int getRows() {
        return CELL_SIZE * rows;
    }

    public int getCols() {
        return CELL_SIZE * cols;
    }

    public int getCellSize() {
        return CELL_SIZE;

    }

    public static int getPADDING() {
        return PADDING;
    }*/
//}




    /*public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public void paint(int col, int row) {

    }
}



    /*
    public load(String);


    public toString();


    public paint();


    public isFilledAt();
}*/
