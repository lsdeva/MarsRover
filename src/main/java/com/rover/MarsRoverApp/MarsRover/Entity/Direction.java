package com.rover.MarsRoverApp.MarsRover.Entity;

public enum Direction {
    N, E, S, W;

    public Direction rotateClockwise() {
        return values()[(ordinal() + 1) % 4];
    }

    public Direction rotateAntiClockwise() {
        return values()[(ordinal() + 3) % 4];
    }
}

