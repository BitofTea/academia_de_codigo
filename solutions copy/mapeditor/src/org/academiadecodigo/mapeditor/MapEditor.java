package org.academiadecodigo.mapeditor;

import org.academiadecodigo.mapeditor.cursor.Cursor;
import org.academiadecodigo.mapeditor.cursor.Direction;
import org.academiadecodigo.mapeditor.grid.Grid;
import org.academiadecodigo.mapeditor.utils.FileManager;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MapEditor {
    private final String FILE_NAME = "saved_map";

    private Grid grid;
    private Cursor cursor;

    public MapEditor(int cols, int rows, int cellSize) {
        grid = new Grid(cols, rows, cellSize);
        cursor = new Cursor(grid);
    }


    public void toggle() {
        grid.toggle(cursor.getCol(), cursor.getRow());
    }

    public void paint() {
        grid.paint(cursor.getCol(), cursor.getRow());
    }

    public void clear() {
        grid.clear(cursor.getCol(), cursor.getRow());
    }

    public void moveCursor(Direction direction) {
        cursor.move(direction);
    }

    public void save() {
        try {
            FileManager.save(FILE_NAME, grid.toString());
        } catch (IOException e) {
            System.err.println("Problems saving to " + FILE_NAME);
        }
    }

    public void load() {
        try {
            String gridText = FileManager.read(FILE_NAME);
            grid.fromString(gridText);
        } catch (FileNotFoundException e) {
            System.err.println("File " + FILE_NAME + " not found.");
        }

    }

}
