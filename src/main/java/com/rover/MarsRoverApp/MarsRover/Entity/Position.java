package com.rover.MarsRoverApp.MarsRover.Entity;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveForward(Direction direction) {
        switch (direction) {
            case N: y++; break;
            case E: x++; break;
            case S: y--; break;
            case W: x--; break;
        }
    }

    public void moveBackward(Direction direction) {
        switch (direction) {
            case N: y--; break;
            case E:x--; break;
            case S: y++; break;
            case W:x++; break;
        }
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
