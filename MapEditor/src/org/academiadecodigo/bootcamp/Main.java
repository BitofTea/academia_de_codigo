package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid(20, 20);
        grid.init();

        Cursor cursor = new Cursor(grid);
        KeyboardListener Listener = new KeyboardListener(cursor);


        //new Cell(10, 20);
        //new Cell(10, 30);
        //new Cell(10, 40);

        //FileHelper.save("resources/save.txt", "ola tenha um bom dia");

        //System.out.println(FileHelper.load("resources/save.txt"));

    }
}
