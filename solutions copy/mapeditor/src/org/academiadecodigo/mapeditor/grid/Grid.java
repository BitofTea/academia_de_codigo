package org.academiadecodigo.mapeditor.grid;

import org.academiadecodigo.mapeditor.grid.Cell;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private final int PADDING = 10;

    private int cols;
    private int rows;
    private int cellSize;
    private Cell[][] cells;

    public Grid(int cols, int rows, int cellSize) {
        this.cols = cols;
        this.rows = rows;
        this.cellSize = cellSize;

        this.cells = new Cell[cols][rows];
        initCells();
    }

    public void paint(int col, int row) {
        this.cells[col][row].paint();
    }

    public void clear(int col, int row) {
        this.cells[col][row].clear();
    }

    public void fromString(String grid) {
        int col = 0;
        int row = 0;

        for (int c = 0; c < grid.length(); c++) {
            System.out.println("Iterating through "+ col + " "  + row);

            if (grid.charAt(c) != '\n') {
                cells[col][row].fromString(String.valueOf(grid.charAt(c)));
                col++;
            } else {
                col = 0;
                row++;
            }
        }
    }


    @Override
    public String toString() {
        String grid = "";

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid += cells[col][row].toString();
            }

            grid += "\n";
        }

        return grid;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public Rectangle createRectangle(int col, int row) {
        int x = PADDING + col * cellSize;
        int y = PADDING + row * cellSize;

        return new Rectangle(x, y, cellSize, cellSize);
    }

    private void initCells() {
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                this.cells[col][row] = new Cell(col, row, this);
            }
        }
    }

    public void toggle(int col, int row) {
        cells[col][row].toggle();
    }
}
