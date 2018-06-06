package org.academiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {

    public boolean moves = true;
    private Rectangle representation;
    private Grid grid;
    private int col;
    private int row;


    public Cursor(Grid grid) {
        this.grid = grid;

        representation = new Rectangle(Grid.PADDING, Grid.PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
        representation.setColor(Color.BLUE);
        representation.fill();

        col = 0;
        row = 0;

        /*int X = 0;
        int y = 0;*/


        }

        public void moveUp () {
            if (col == 0) {
                return;
            }

            col--;
            representation.translate(0, -Grid.CELL_SIZE);
        }

        public void moveDown () {
            if (col == grid.getCols() - 1) {
                return;
            }

            col++;
            representation.translate(0, Grid.CELL_SIZE);
        }


        public void moveLeft () {
            if (row == 0) {
                return;

            }

            row--;
            representation.translate(0, -Grid.CELL_SIZE);
        }

        public void moveRight () {
            if (row == grid.getRows() - 1) {
                return;
            }

            row++;
            representation.translate(0, Grid.CELL_SIZE);
        }

        public void paint () {
            grid.paint(col, row);
        }
    }
