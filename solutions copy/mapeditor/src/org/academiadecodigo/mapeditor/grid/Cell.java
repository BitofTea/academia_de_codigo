package org.academiadecodigo.mapeditor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Rectangle rectangle;

    public Cell(int col, int row, Grid grid) {
        rectangle = grid.createRectangle(col, row);
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }

    public void paint() {
        rectangle.fill();
    }

    public void clear() {
       rectangle.draw();
    }

    public boolean isPainted() {
        return rectangle.isFilled();
    }

    @Override
    public String toString() {
        return isPainted() ? "#" : "_";
    }

    public void fromString(String str) {
        if (str.equals("#")) {
            paint();
        } else {
            clear();
        }
    }

    public void toggle() {
        if (isPainted()) {
            clear();
        } else {
            paint();
        }
    }
}
