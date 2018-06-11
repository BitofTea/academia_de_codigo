package org.academiadecodigo.mapeditor.cursor;

import org.academiadecodigo.mapeditor.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {

    private Rectangle rectangle;
    private int col;
    private int row;
    private int gridCols;
    private int gridRows;

    public Cursor(Grid grid) {
        col = 0;
        row = 0;
        gridCols = grid.getCols();
        gridRows = grid.getRows();

        rectangle = grid.createRectangle(col, row);
        rectangle.setColor(Color.GREEN);
        rectangle.fill();
    }

    public void move(Direction direction) {

        switch (direction) {
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
                break;
        }
    }

    private void moveRight() {
        if (col == gridCols - 1) {
            return;
        }

        rectangle.translate(rectangle.getWidth(), 0);
        col++;
    }

    private void moveLeft() {
        if (col == 0) {
            return;
        }

        rectangle.translate(-rectangle.getWidth(), 0);
        col--;
    }

    private void moveDown() {
        if (row == gridRows - 1) {
            return;
        }

        rectangle.translate(0, rectangle.getHeight());
        row++;
    }

    private void moveUp() {
        if (row == 0) {
            return;
        }

        rectangle.translate(0, -rectangle.getHeight());
        row--;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
