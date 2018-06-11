package org.academiadecodigo.mapeditor;

public class Main {

    public static void main(String[] args) {
        MapEditor editor = new MapEditor(5, 5, 20);
        Controller ctrl = new Controller(editor);
    }
}
