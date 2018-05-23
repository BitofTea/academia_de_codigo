package org.academiadecodigo.bootcamp.gfx.simplegfx;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    private static final int CELL_SIZE = 15;

    //No field defini o estado, propriedades do meu objecto SimpleGfxGrid.java:

    private int cols;
    private int rows;

    //Aqui atribuimos valores ás variáveis que nos foram dadas neste método, com parâmetros - assinatura deste método:

    public SimpleGfxGrid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * @see Grid#init () initializes the field simple graphics rectangle and draws it
     */

    //Aqui vamos imprimir o resultado/output do nosso novo objecto criado em Simple-Graphics, em pixels - rectângulo.
    //Este rectângulo é definido recorrendo ao Package, na Class: lá estão as especificações de como fazê-lo, os métodos que podem ser usados e sua descrição.
    //Defini criar um background preenchido numa cor.

    @Override
    public void init() {
        Rectangle background = new Rectangle(10, 10, CELL_SIZE * cols, CELL_SIZE * rows);
        background.draw();
        //background.setColor(Color.BLUE);
        //background.fill();

    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        throw new UnsupportedOperationException();
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        throw new UnsupportedOperationException();
    }

    /**
     * Obtains the width of the grid in pixels
     * @return the width of the grid
     */
    public int getWidth() {
        return CELL_SIZE * cols;
    }

    /**
     * Obtains the height of the grid in pixels
     * @return the height of the grid
     */
    public int getHeight() {
        return CELL_SIZE * rows;
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     * @return the x position of the grid
     */
    public int getX() {
        return 10;
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     * @return the y position of the grid
     */
    public int getY() {
        return 10;
    }

    /**
     * Obtains the pixel width and height of a grid position
     * @return
     */
    public int getCellSize(){
     return  CELL_SIZE;

    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        SimpleGfxGridPosition position = new SimpleGfxGridPosition(this);
        return position;
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        SimpleGfxGridPosition position = new SimpleGfxGridPosition(col, row, this);
        return position;
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     * @param row index
     * @return y pixel value
     */

    //rowTOY dá-me o cálculo de rows para pixeis.
    public int rowToY(int row) {
        return CELL_SIZE * row + PADDING;

    }
    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return CELL_SIZE * column + PADDING;
    }
}
