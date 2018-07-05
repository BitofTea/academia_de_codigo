package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Position;

//Different types of cars exist
//Cars move at different speeds and in different ways
//A car crash at any time

abstract public class Car {

    private Position position;
    private CarType carType;
    private Direction currentDirection;
    private boolean crashed;

    public Car(CarType carType, Position position) {
        this.position = position;
        this.carType = carType;
        currentDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];

    }

    public void crash() {
        this.crashed = true;

    }

    public boolean isCrashed() {
        System.out.println(crashed);
        return crashed;

    }

    /**
     * The position of the car on the grid
     */
    public Position getPosition() {
        return position;
    }

    public Direction chooseDirection() {
        currentDirection = Direction.values()[(int) (Math.random() * Direction.values().length)];
        return currentDirection;

    }

    abstract public void move();


    //Todo este método é um pouco confuso... para mim, claro!

    public void accelerate(Direction direction, int speed) {

        //Se o carro estiver parado, sair logo do método.
        if (isCrashed()) {
            return;
        }

        Direction newDirection = direction;

        if (position.isOnEdge(direction) && newDirection.equals(currentDirection)) {

            newDirection = currentDirection.oppositeDirection();
        }

        this.currentDirection = newDirection;

        //newDirection ou newPosition como argumento?
        getPosition().moveInDirection(newDirection, speed);

    }

    @Override
    public String toString() {
        return isCrashed() ? "C" : Character.toString(carType.getSymbol());

    }
}


