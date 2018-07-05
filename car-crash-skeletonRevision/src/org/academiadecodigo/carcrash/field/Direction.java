package org.academiadecodigo.carcrash.field;

public enum Direction {

    UP,
    DOWN,
    LEFT,
    RIGHT;

    public Direction oppositeDirection(){
        Direction opposite = Direction.UP; //Porquê esta equivalência da direcção oposta a Direction.UP?

        switch (this){
            case UP:
                opposite = Direction.DOWN;
                break;
            case DOWN:
                opposite = Direction.UP;
                break;
            case RIGHT:
                opposite = Direction.LEFT;
                break;
            case LEFT:
                opposite = Direction.RIGHT;
                break;
        }

       return opposite;

    }

}
