package com.rover.MarsRoverApp.MarsRover.Exceptions;

public class InvalidCommandException extends RuntimeException{
    public InvalidCommandException(String message) {
        super(message);
    }
}
