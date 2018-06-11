package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Rectangle representation;

    public Cell(int x, int y) {


        representation = new Rectangle(x, y, 10, 10);
        representation.draw();


    }

    public void paint() {
        representation.fill();
    }

    public void unPaint() {
        representation.draw();
    }

    public boolean isFilled() {
        return representation.isFilled();
    }
}
    /* public int getX() {
        return 10;
    }

    public int getY() {
        return 10;
    }

    public boolean filled() {

        if (representation.isFilled()) {
            return true;

        } else {


            return false;

        }
    }*/
