package com.rover.MarsRoverApp.MarsRover.Entity;

public class MarsRover {
    private Position position;

    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.position = new Position(x, y);
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    private String getPrintableDirection(Direction direction){
        return switch (direction) {
            case N -> "NORTH";
            case E -> "EAST";
            case S -> "SOUTH";
            case W -> "WEST";
        };
    }

    public String getStatus() {
        return "Final Coordinate: " + position + "\nFinal Direction: " + getPrintableDirection(direction);
    }
}

