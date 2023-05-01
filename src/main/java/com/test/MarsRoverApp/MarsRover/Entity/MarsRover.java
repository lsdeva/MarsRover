package com.test.MarsRoverApp.MarsRover.Entity;

import org.springframework.stereotype.Component;

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
        switch (direction) {
            case N: return "NORTH";
            case E: return "EAST";
            case S: return "SOUTH";
            case W: return "WEST";
        }
        return "";
    }

    public String getStatus() {
        return "Final Coordinate: " + position + "\nFinal Direction: " + getPrintableDirection(direction);
    }
}

